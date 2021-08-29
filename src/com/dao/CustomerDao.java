package com.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Customer;
import com.bean.Orders;
import com.bean.Product;
import com.bean.Quote;

@Repository
public class CustomerDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int storeCustomerDetails(Customer cc) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(cc);
		tran.commit();
		
		Customer c = manager.find(Customer.class, cc.getEmail());
		if(c!=null) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public float getBalanceDetails(String email) {
		EntityManager manager = emf.createEntityManager();
		Customer cc = manager.find(Customer.class,email);
		return cc.getAmount();
	}
	
	public int addAmount(String email, float amount) {
		EntityManager manager = emf.createEntityManager();
		Customer cc = manager.find(Customer.class,email);
		cc.setAmount(cc.getAmount()+amount);;
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.merge(cc);
		tran.commit();
		
		if(cc.getAmount()>=amount) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int placeQuote(Quote q) {
		System.out.println(q.toString());
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
			
			//Customer cc = manager.find(Customer.class, email);
			tran.begin();
				manager.persist(q);
				//manager.merge(cc);
			tran.commit();
		return 1;
	}
	
	
public int placeOrder(String productNames,String email, float totalAmount) {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
			
			Customer cc = manager.find(Customer.class, email);
			cc.setAmount(totalAmount - cc.getAmount());
			Orders or = new Orders();
			or.setEmail(email);
			or.setOrderDate(Date.valueOf(LocalDate.now()));
			or.setProductName(productNames);
			or.setAmount(totalAmount);
			tran.begin();
				manager.persist(or);
				manager.merge(cc);
			tran.commit();
		return 1;
	}
	
	public List<Orders> getOrderDetails(String email){
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select o from Orders o where o.email=?1");
		qry.setParameter(1, email);
		return qry.getResultList();
	}
	
	public List<Quote> getQuoteDetails(String email){
		System.out.print("DAOOOOOO\n");
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select a from Quote a where a.email=?1");
		System.out.print(qry.toString());
		qry.setParameter(1, email);
		List<Quote> q = qry.getResultList();
		System.out.print(q.toString());
		return q;
	}
	
	public float getBalanceAmount(String email) {
		EntityManager manager = emf.createEntityManager();
		Customer cc = manager.find(Customer.class, email);
		return cc.getAmount();
	}
	
	public List<Customer> getAllCustomer() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select c from Customer c");
		return qry.getResultList();
	}
}


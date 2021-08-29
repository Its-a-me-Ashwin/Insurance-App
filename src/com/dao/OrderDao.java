package com.dao;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Customer;
import com.bean.Orders;
import com.bean.Quote;

@Repository
public class OrderDao {

	@Autowired
	EntityManagerFactory emf;
	
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
		System.out.println("Starting query");
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select o from Quote o where o.email=?1");
		qry.setParameter(1, email);
		return qry.getResultList();
		/*
		Query qry = manager.createQuery("select o from Quote o where o.email=?1");
		System.out.println("q2");
		qry.setParameter(1, email);
		System.out.println("q3");
		//List<Quote> q = (List<Quote>) manager.find(Quote.class, email);
		System.out.println("q4");
		List<Quote> q = qry.getResultList();
		System.out.println("q5");
		*/
	}
	
	public float getBalanceAmount(String email) {
		EntityManager manager = emf.createEntityManager();
		Customer cc = manager.find(Customer.class, email);
		return cc.getAmount();
	}
	
	public List<Customer> getCustomer(String email) {
		EntityManager manager = emf.createEntityManager();
		Customer cc = manager.find(Customer.class, email);
		List<Customer> c = Arrays.asList(cc); 
		return c;
	}
	
	
}


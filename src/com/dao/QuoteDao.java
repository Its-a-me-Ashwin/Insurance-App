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
import com.bean.Login;
import com.bean.Orders;
import com.bean.Product;
import com.bean.Quote;
import com.utility.Items;

@Repository
public class QuoteDao {
	@Autowired
	EntityManagerFactory emf;
	
	public int placeQuote(Quote q,String email) {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
			
			Customer cc = manager.find(Customer.class, email);
			tran.begin();
				manager.persist(q);
				manager.merge(cc);
			tran.commit();
		return 1;
	}
	
	public List<Quote> getQuotesDetails(String email){
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select o from Orders o where o.email=?1");
		qry.setParameter(1, email);
		return qry.getResultList();
	}
	
}

package com.service;

import java.util.Random;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.bean.Product;
import com.bean.Quote;
import com.bean.QuoteDetails;
import com.dao.CustomerDao;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public String storeQuote(QuoteDetails qd,String email) {
		Random rand = new Random();
		Quote q = new Quote();
		// add more logic here
		int base = 1000;
		base += qd.getArea()*1.5 + qd.getValue();
		int dwelling = 1000;
		dwelling += 2000*qd.getFullBaths() + 500*qd.getHalfBaths();
		
		q.setMonthlypremium(base); // change later
		q.setDwellingcoverage(dwelling);
		q.setPersonalproperty(1);
		q.setMedicalexpense(500);
		q.setAdditional(1000);
		q.setDeductible(100);
		q.setEmail(email);
		System.out.println(email);
		System.out.println("done at service");
		customerDao.placeQuote(q);
		return "";
	}
	
	
	public String storeCustomerDetails(Customer cc) {
		cc.setAmount(1000);
		if(customerDao.storeCustomerDetails(cc)>0) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	public float getBalanceDetails(String email) {
		return customerDao.getBalanceDetails(email);
	}
	
	public String addAmount(String email, float amount) {
		if(customerDao.addAmount(email, amount)>0) {
			return "Amount Added successfully";
		}else {
			return "Amount didn't add";
		}
	}
	
	public List<Customer> getAllCustomer(){
		return customerDao.getAllCustomer();
	}
}

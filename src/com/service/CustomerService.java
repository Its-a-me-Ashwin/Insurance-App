package com.service;


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
		Quote q = new Quote();
		// add more logic here
		q.setMonthlyPremium(1000); // change later
		q.setDwellingCoverage(50);
		q.setPersonalProperty(1);
		q.setMedicalexpense(0);
		q.setAdditional(0);
		q.setDeductible(0);
		System.out.println("done at service");
		customerDao.placeQuote(q,email);
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

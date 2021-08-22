package com.service;

import org.springframework.stereotype.Service;

import com.bean.QuoteDetails;
import com.bean.Quote;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class QuoteService {
	public String storeQuote(QuoteDetails qd) {
		Quote q = new Quote();
		// add more logic here
		q.setMonthlyPremium(1000); // change later
		q.setDwellingCoverage(50);
		q.setPersonalProperty(1);
		q.setMedicalexpense(0);
		q.setAdditional(0);
		q.setDeductible(0);
		return "";
	}
}

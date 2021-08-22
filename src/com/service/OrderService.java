package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.dao.CustomerDao;
import com.utility.Items;
import com.bean.Quote;
@Service
public class OrderService {

	
	@Autowired
	CustomerDao orderDao;
	
	public String placeOrder(List<Items> listOfItems,String user, float totalAmount) {
		String productNames ="";
		for(Items item : listOfItems) {
			productNames = productNames+","+item.getProduct().getProductName();
		}
		float balanceAmount = orderDao.getBalanceAmount(user);
		if(balanceAmount<totalAmount) {
			return "Insufficient amount"; 
		}else {
			if(orderDao.placeOrder(productNames.substring(1),user,totalAmount)>0) {
				return "Order Placed successfully";
			}else {
				return "Order didn't place";
			}
		}
		
	}
	
	public List<Orders> getAllOrderDetails(String email){
		return orderDao.getOrderDetails(email);
	}
	
	public List<Quote> getAllQuoteDetails(String email){
		return orderDao.getQuoteDetails(email);
	}
}


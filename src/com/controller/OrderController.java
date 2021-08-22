package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Orders;
import com.service.OrderService;
import com.bean.Quote;
@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "orderDetails/{email}")
	public ModelAndView getOrderDetails(@PathVariable("email") String email,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		List<Orders> listOfOrder = orderService.getAllOrderDetails(email);
		session.setAttribute("orderDetails", listOfOrder);
		mav.setViewName("redirect:/OrderDetails.jsp");
		return mav;
	}
	
	@RequestMapping(value = "viewQuotes/{email}")
	public ModelAndView getQuoteDetails(@PathVariable("email") String email,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		List<Quote> listOfOrder = orderService.getAllQuoteDetails(email);
		session.setAttribute("quoteDetails", listOfOrder);
		mav.setViewName("redirect:/viewAllQuotes.jsp");
		return mav;
	}
}


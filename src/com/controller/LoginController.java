package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView openLoginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login.jsp");
		return mav;
	}
	
	@RequestMapping(value = "loginCheck",method = RequestMethod.POST)
	public ModelAndView storeEmployeeDetails(HttpServletRequest req,Login login,HttpSession session) {
		login.setEmail(req.getParameter("email"));
		login.setPassword(req.getParameter("password"));
		login.setTypeOfUser(req.getParameter("typeOfUser"));
		
		ModelAndView mav = new ModelAndView();
		if(login.getTypeOfUser().equals("admin")) {
			String adminResult = loginService.checkAdminUser(login);
			if(adminResult.equals("success")) {
						mav.setViewName("adminHome.jsp");
			}else {
				mav.addObject("msg", "InValid username or password");
				mav.setViewName("index.jsp");
			}
		}else {
			String customerResult = loginService.checkCustomerUser(login);
			if(customerResult.equals("success")) {
				session.setAttribute("user", login.getEmail());
				mav.setViewName("customerHome.jsp");
			}else {
				mav.addObject("msg", "InValid username or password");
				mav.setViewName("index.jsp");
			}
		}
		session.removeAttribute("pmsg");
		session.removeAttribute("productInfo");
		session.removeAttribute("productUpdateMsg");
		session.removeAttribute("orderMsg");
		session.removeAttribute("amountAddMsg");
		return mav;
	}
	
	@RequestMapping(value = "adminDashboard",method = RequestMethod.GET)
	public ModelAndView adminDashboard() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("adminHome.jsp");
		return mav;
	}
	
	@RequestMapping(value = "logout",method = RequestMethod.GET)
	public ModelAndView logOut() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
}

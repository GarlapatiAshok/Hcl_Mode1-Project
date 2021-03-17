/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(value = "/adminLogout", method = RequestMethod.GET)
	public String showLogout(HttpServletRequest request) {
	
		
		
        HttpSession session=request.getSession(false);
        if(session!=null) {
        session.invalidate();  
        
        request.setAttribute("logout", "You are successfully logged out!");
        }
		
				
		return "AdminLogin";
	}
	
	@RequestMapping(value = "/custLogout", method = RequestMethod.GET)
	public String showLogout1(HttpServletRequest request) {
	
		 HttpSession session=request.getSession(false);
	        if(session!=null) {
	        session.invalidate();  
	        
	        request.setAttribute("logout", "You are successfully logged out!");
	        }
			
				
		return "CustLogin";
	}
	
}

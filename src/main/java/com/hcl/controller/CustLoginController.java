/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.service.CustLoginService;

@Controller
public class CustLoginController {

	  public CustLoginService custLoginService;
		 
	  @Autowired
		public CustLoginController(CustLoginService custLoginService)
		{
			this.custLoginService=custLoginService;
		}
	  
	  
	  @RequestMapping(value = "/custLogin", method = RequestMethod.GET)
		public String showLogin() {
		System.out.println("login");
			return "CustLogin";
		}

		
		@RequestMapping(value="/custValidate")
		public ModelAndView validate(@RequestParam("custloginid") String custloginid,@RequestParam("password") String password,javax.servlet.http.HttpSession session,HttpServletRequest request) {
			
			ModelAndView mv1=new ModelAndView();
			Long cid=Long.parseLong(custloginid);
			String userPassword=custLoginService.getPassword(cid);
			if(password.equals(userPassword)) {
				mv1.setViewName("CustHome");
			}else {
				request.setAttribute("error", "Invalid Username or Password!!");
				mv1.setViewName("CustLogin");
			}
			
			return mv1;
		}
}

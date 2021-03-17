/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.AccountDetails;
import com.hcl.service.AccountDetailsService;

@Controller
public class AccountDetailsController {

	public AccountDetailsService accountDetailsService;
	 
	  @Autowired
		public AccountDetailsController(AccountDetailsService accountDetailsService)
		{
			this.accountDetailsService=accountDetailsService;
		}
	  
	  @RequestMapping(value = "/getAllAccDetails")
	    public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<AccountDetails> listAccDetails = accountDetailsService.getAllAccountDetails();
	        model.addObject("listAccDetails", listAccDetails);
	        model.setViewName("AllAccountDetails");
	        return model;
	    }
	  
}

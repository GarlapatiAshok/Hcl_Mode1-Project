/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/bankHome", method = RequestMethod.GET)
	public String showBankHome() {
		return "BankHome";
	}
	
	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String showAdminHome() {
		return "AdminHome";
	}
	
	@RequestMapping(value = "/custHome", method = RequestMethod.GET)
	public String showCustHome() {
		return "CustHome";
	}
	
}

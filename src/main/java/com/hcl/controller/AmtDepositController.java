/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hcl.service.AmtDepositService;

@Controller
public class AmtDepositController {

	public AmtDepositService amtDepositService;
	
	@Autowired
	public AmtDepositController(AmtDepositService amtDepositService)
	{
		this.amtDepositService=amtDepositService;
	}
	
	
	@RequestMapping(value = "/amtDeposit", method = RequestMethod.GET)
	public String showLogin() {
	System.out.println("login");
		return "AmtDeposit";
	}

	
	@RequestMapping(value="/amtDepositValidate")
	public ModelAndView validate(@RequestParam("accnum") String accnum,@RequestParam("amtDeposit") String amtDeposit,javax.servlet.http.HttpSession session,RedirectAttributes redirectAttributes) {
		
		try {
		ModelAndView mv1=new ModelAndView();
		
		Long accNum=Long.parseLong(accnum);
		Double amtDepst=Double.parseDouble(amtDeposit);
		String txnType="SAVINGSBANK";
		
		amtDepositService.amtWithdrawl(accNum, amtDepst, txnType);
		
		}catch (Exception e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message", "Failure occured during Amount Transfer!");
		}
		
		return new ModelAndView("AmtDeposit", "message", "YOU HAVE SUCCESSFULLY TRANSFERD!!");
	}
	
	
}

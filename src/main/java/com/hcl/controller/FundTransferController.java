/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hcl.service.FundTransaferService;

@Controller
public class FundTransferController {
	
	public FundTransaferService fundTransaferService;
	 
	  @Autowired
		public FundTransferController(FundTransaferService fundTransaferService)
		{
			this.fundTransaferService=fundTransaferService;
		}


	@RequestMapping(value = "/fundTrans", method = RequestMethod.GET)
	public String showLogin() {
	System.out.println("login");
		return "FundTransfer";
	}

	
	@RequestMapping(value="/fundTransValidate")
	public ModelAndView validate(@RequestParam("fromaccnum") String fromAccNum,@RequestParam("toaccnum") String toAccNum,@RequestParam("amount") String accBal,@RequestParam("remarks") String remarks,javax.servlet.http.HttpSession session,RedirectAttributes redirectAttributes) {
		
		try {
		ModelAndView mv1=new ModelAndView();
		
		Long frmAcc=Long.parseLong(fromAccNum);
		Long toAcc=Long.parseLong(toAccNum);
		Double bal=Double.parseDouble(accBal);
		String txnType="FUNDTRANSFER";
		
		fundTransaferService.fundTransfer(frmAcc, toAcc, bal, remarks, txnType);
		
		}catch (Exception e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message", "Failure occured during Amount Transfer!");
		}
		
		return new ModelAndView("FundTransfer", "message", "YOU HAVE SUCCESSFULLY TRANSFERD!!");
	}
	
}

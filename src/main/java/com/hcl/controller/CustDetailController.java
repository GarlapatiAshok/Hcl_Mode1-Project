/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.AccountDetails;
import com.hcl.model.AccountRegister;
import com.hcl.service.CustDetailService;

@Controller
public class CustDetailController {

	public CustDetailService custDetailService;
	
	@Autowired
	public CustDetailController(CustDetailService custDetailService)
	{
		this.custDetailService=custDetailService;
	}
	
	@RequestMapping(value = "/getAllCustDetails")
    public ModelAndView listEmployee(ModelAndView model) throws IOException {
      
        List<AccountRegister> listCustDetails1 =custDetailService.getAllCustDetails1();
        
     
        model.addObject("listCustDetails1", listCustDetails1);
        
        model.setViewName("CustDetail");
        return model;
    }
	
}

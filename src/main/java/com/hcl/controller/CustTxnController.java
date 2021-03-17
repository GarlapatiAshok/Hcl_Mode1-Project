/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.CustTxn;
import com.hcl.service.CustTxnServiceImpl;

@Controller
public class CustTxnController {

	
	public CustTxnServiceImpl custTxnServiceImpl;

	 @Autowired
	public void setCustTxnServiceImpl(CustTxnServiceImpl custTxnServiceImpl) {
		this.custTxnServiceImpl = custTxnServiceImpl;
	}
	 
	 
	 @RequestMapping(value = "/getAllTxnDetails")
	    public ModelAndView listTxn(ModelAndView model) throws IOException {
	        List<CustTxn> listTxnDetails = custTxnServiceImpl.getAllTxnDetails();
	        model.addObject("listTxnDetails", listTxnDetails);
	        model.setViewName("TxnDetails");
	        return model;
	    }
	  
	 @RequestMapping(value = "/getAllCustTxnDetails")
	    public ModelAndView listTxn1(ModelAndView model) throws IOException {
	        List<CustTxn> listTxnDetails = custTxnServiceImpl.getAllTxnDetails();
	        model.addObject("listTxnDetails", listTxnDetails);
	        model.setViewName("CustTxn");
	        return model;
	    }
	  
	  
}

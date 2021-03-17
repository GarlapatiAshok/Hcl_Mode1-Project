/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hcl.model.AccountRegister;
import com.hcl.service.AccountRegService;

@Controller
public class AccountRegController {

	public AccountRegService accountRegService;

	@Autowired
	public AccountRegController(AccountRegService accountRegService) {
		this.accountRegService = accountRegService;
	}

	private String name, fatherName, gender, address, mobilenumber, email, pan, aadhar, password, dob;

	@RequestMapping(value = "/showRegister")
	public ModelAndView showRegister() {
		ModelAndView view = new ModelAndView();
		view.setViewName("AccountRegister");
		return view;
	}

	@RequestMapping(value = "/register")
	public ModelAndView register(@ModelAttribute(value = "AccountRegister") AccountRegister accountRegister,
			HttpSession session, RedirectAttributes redirectAttributes) throws Exception {
		// SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		// java.util.Date dobFormat = format.parse(dob);
		try {
			ModelAndView view = new ModelAndView();
			view.addObject(accountRegister);

			name = accountRegister.getName();
			fatherName = accountRegister.getFatherName();
			gender = accountRegister.getGender();
			address = accountRegister.getAddress();
			dob = accountRegister.getDob();
			mobilenumber = accountRegister.getMobilenumber();
			email = accountRegister.getEmail();
			pan = accountRegister.getPan();
			aadhar = accountRegister.getAadhar();
			password = accountRegister.getPassword();

			accountRegService.register(name, fatherName, gender, address, dob, mobilenumber, email, pan, aadhar,
					password);

			accountRegService.accInsrt();
			
			accountRegService.custInsrt();
			
			accountRegService.passInsrt();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message", "Failure occured during account creation!!");
		}

		// view.setViewName("AccountRegister");
		return new ModelAndView("AccountRegister", "message", "YOU HAVE CREATED ACCOUNT SUCCESSFULLY!!");

	}

}

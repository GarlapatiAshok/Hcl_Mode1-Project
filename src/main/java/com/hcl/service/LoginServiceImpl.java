/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
              this.loginDAO = loginDAO;
       }
      
	   public String getPassword(String adminUserId) {
              System.out.println("In Service class...Check Login");
              return loginDAO.getPassword(adminUserId);
       }
}

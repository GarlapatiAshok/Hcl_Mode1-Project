/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AccountRegDao;

@Service("accountRegService")
public class AccountRegServiceImpl implements AccountRegService {

	 @Autowired
	private AccountRegDao accountRegDao;
	 
	public void setAccountRegDao(AccountRegDao accountRegDao) {
		this.accountRegDao = accountRegDao;
	}


	@Override
	public void register(String name, String fatherName, String gender, String address, String dob, String mobilenumber, String email,
			String pan, String aadhar, String password) {
		
		accountRegDao.register(name, fatherName, gender, address, dob, mobilenumber, email, pan, aadhar, password);

	}
	
	public void accInsrt() {
		
		accountRegDao.accInsrt();
	}

	public void passInsrt() {
		
		accountRegDao.passInsrt();
	}
	
	public void custInsrt() {
		
		accountRegDao.custInsrt();
	}
}

/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AccountDetailsDao;
import com.hcl.model.AccountDetails;

@Service("accountDetailsService")
//@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class AccountDetailsServiceImpl implements AccountDetailsService{

	@Autowired
	private AccountDetailsDao accountDetailsDao;
	
	public void setAccountDetailsDao(AccountDetailsDao accountDetailsDao) {
		this.accountDetailsDao = accountDetailsDao;
	}

	//@Transactional(readOnly=true)
	public List<AccountDetails> getAllAccountDetails(){
		
		return accountDetailsDao.getAllAccountDetails();
		
	}
	
}

/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.CustDetailDao;
import com.hcl.model.AccountDetails;
import com.hcl.model.AccountRegister;

@Service("custDetailService")
public class CustDetailServiceImpl implements CustDetailService {

	@Autowired
	private CustDetailDao custDetailDao;
	
	public void setCustDetailDao(CustDetailDao custDetailDao) {
		this.custDetailDao = custDetailDao;
	}

	

	@Override
	public List<AccountRegister> getAllCustDetails1() {
		
		return custDetailDao.getAllCustDetails1();
	}

}

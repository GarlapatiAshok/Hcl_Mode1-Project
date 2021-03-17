/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.FundTransaferDao;

@Service("fundTransaferService")
public class FundTransaferServiceImpl implements FundTransaferService {

	@Autowired
	private FundTransaferDao fundTransaferDao;
	
	public void setAccountDetailsDao(FundTransaferDao fundTransaferDao) {
		this.fundTransaferDao = fundTransaferDao;
	}
	
	@Override
	public void fundTransfer(Long fromAccNum, Long toAccNum, Double accBal, String remarks, String txnType) {
	
		fundTransaferDao.fundTransfer(fromAccNum, toAccNum, accBal, remarks, txnType);

	}

}

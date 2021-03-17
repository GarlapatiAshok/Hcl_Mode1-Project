/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AmtDepositDao;

@Service("amtDepositService")
public class AmtDepositServiceImpl implements AmtDepositService {

	
	@Autowired
	private AmtDepositDao amtDepositDao;

	public void setAmtDepositDao(AmtDepositDao amtDepositDao) {
		this.amtDepositDao = amtDepositDao;
	}


	@Override
	public void amtWithdrawl(Long fromAccNum, Double accBal, String txnType) {
		
		amtDepositDao.amtDepositDao(fromAccNum, accBal, txnType);

	}

}

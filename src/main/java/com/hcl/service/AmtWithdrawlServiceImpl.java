/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AmtWithdrawlDao;

@Service("amtWithdrawlService")
public class AmtWithdrawlServiceImpl implements AmtWithdrawlService {

	@Autowired
	private AmtWithdrawlDao amtWithdrawlDao;
	
	public void setAmtWithdrawlDao(AmtWithdrawlDao amtWithdrawlDao) {
		this.amtWithdrawlDao = amtWithdrawlDao;
	}


	@Override
	public void amtWithdrawl(Long fromAccNum, Double accBal, String txnType) {
		
		amtWithdrawlDao.amtWithdrawl(fromAccNum, accBal, txnType);
	}

}

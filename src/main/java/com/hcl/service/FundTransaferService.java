/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

public interface FundTransaferService {

	public void fundTransfer(Long fromAccNum,Long toAccNum,Double accBal, String remarks, String txnType);
	
}

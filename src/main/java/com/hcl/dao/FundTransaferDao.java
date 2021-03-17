/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.dao;

public interface FundTransaferDao {

	public void fundTransfer(Long fromAccNum,Long toAccNum,Double accBal, String remarks, String txnType);
	
}

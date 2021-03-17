/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.CustTxnDao;
import com.hcl.model.CustTxn;

@Service("custTxnService")
public class CustTxnServiceImpl implements CustTxnService {

	
	@Autowired
	private CustTxnDao custTxnDao;

	public void setCustTxnDao(CustTxnDao custTxnDao) {
		this.custTxnDao = custTxnDao;
	}




	@Override
	public List<CustTxn> getAllTxnDetails() {
		
		
		return custTxnDao.getAllTxnDetails();
	}

}

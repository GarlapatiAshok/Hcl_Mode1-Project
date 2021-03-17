/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.CustLoginDao;

@Service("custLoginService")
public class CustLoginServiceImpl implements CustLoginService {

	@Autowired
	private CustLoginDao custLoginDao;

	public void setCustLoginDao(CustLoginDao custLoginDao) {
		this.custLoginDao = custLoginDao;
	}

	@Override
	public String getPassword(Long custloginid) {
	
		return custLoginDao.getPassword(custloginid);
	}

}

/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.AccountDetails;
import com.hcl.model.AccountRegister;

@Repository("custDetailDao")
public class CustDetailDaoImpl implements CustDetailDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<AccountRegister> getAllCustDetails1(){
		
		Session session = sessionFactory.openSession();
		List<AccountRegister> accList1 = new ArrayList<AccountRegister>();
		try {

			String SQL_QUERY1 = "from AccountRegister";
			Query query1 = session.createQuery(SQL_QUERY1);
			java.util.List list1 = query1.list();
			System.out.println(list1);
			Iterator it1 = query1.iterate();
			while (it1.hasNext()) {
				AccountRegister obj1 = (AccountRegister) it1.next();
			
				obj1.getCustomerId();
				obj1.getBranchName();
				obj1.getIfscCode();			
				obj1.getId();
				obj1.getName();
				obj1.getDob();
				obj1.getMobilenumber();
				obj1.getEmail();
				obj1.getAadhar();
				obj1.getPan();
				accList1.add(obj1);
			}

			
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return accList1;
	
	}
}

/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.dao;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hcl.model.AccountRegister;

@Repository("accountRegDao")
public class AccountRegDaoImpl implements AccountRegDao {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}
	
	Long accNum=0L;
	Long custId=0L;
	String branchName=null;
	String ifscCode=null;
	
	@Override
	public void register(String name, String fatherName, String gender, String address, String dob, String mobilenumber, String email,
			String pan, String aadhar, String password) {
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		try {
			AccountRegister accRegister = new AccountRegister();
			accRegister.setName(name);
			accRegister.setFatherName(fatherName);
			accRegister.setGender(gender);
			accRegister.setAddress(address);
			accRegister.setDob(dob);
			accRegister.setMobilenumber(mobilenumber);
			accRegister.setEmail(email);
			accRegister.setPan(pan);
			accRegister.setAadhar(aadhar);
			accRegister.setPassword(password);
			
			session.save(accRegister);
			session.flush();
			session.clear();
			beginTransaction.commit();
		} catch (HibernateException e) {

			e.printStackTrace();
		} finally {
			session.close();
		}

	}
	
	
	public void accInsrt() {
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		try {
			
			 String SQL_QUERY ="select ar.id from AccountRegister ar order by ar.id desc"; 
			 Query query = session.createQuery(SQL_QUERY);
			
			 java.util.List list = query.list();
				System.out.println(list);

				 accNum=(Long) list.get(0);
				System.out.println(accNum);

					String SQL_QUERY1 ="insert into AccountDetails(accnum) values("+ accNum +")"; 
					 Query query1 = session.createSQLQuery(SQL_QUERY1);
					 query1.executeUpdate();		
		
			session.flush();
			session.clear();
			beginTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
public void custInsrt() {
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		
		try {
			
			String SQL_QUERY2 ="select ad.customerId from AccountDetails ad where ad.accnum='"+ accNum +"'"; 
			 Query query2 = session.createQuery(SQL_QUERY2);
			
			 java.util.List list1 = query2.list();
				System.out.println(list1);

				 custId= (Long) list1.get(0);
				System.out.println(custId);
				
				String SQL_QUERY5 ="select ad.branchName from AccountDetails ad where ad.accnum='"+ accNum +"'"; 
				 Query query5 = session.createQuery(SQL_QUERY5);
				
				 java.util.List list5 = query5.list();
					System.out.println(list5);

					 branchName= (String) list5.get(0);
					System.out.println(branchName);
					
					String SQL_QUERY6 ="select ad.ifscCode from AccountDetails ad where ad.accnum='"+ accNum +"'"; 
					 Query query6 = session.createQuery(SQL_QUERY6);
					
					 java.util.List list6 = query6.list();
						System.out.println(list6);

						 ifscCode= (String) list6.get(0);
						System.out.println(ifscCode);
				
			String SQL_QUERY3 ="insert into CustLogin(custloginid) values("+ custId +")"; 
			 Query query3 = session.createSQLQuery(SQL_QUERY3);
			 query3.executeUpdate();
			 
			
			 String SQL_QUERY4 ="update  ACCOUNTREG set CUSTOMERID='"+custId+"',BRANCHNAME='"+branchName+"',IFSCCODE='"+ifscCode+"' where ACCOUNTNUMBER='"+ accNum +"'";
				Query query4 = session.createSQLQuery(SQL_QUERY4);
				 query4.executeUpdate();
				 
			 session.flush();
				session.clear();
				beginTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}



  public void passInsrt() {
  
  Session session = sessionFactory.openSession(); Transaction beginTransaction
  = session.beginTransaction();
  
  try {
  
  String SQL_QUERY4
  ="select ar.password from AccountRegister ar where ar.id='"+ accNum +"'";
  Query query4 = session.createQuery(SQL_QUERY4);
  
  java.util.List list1 = query4.list(); System.out.println(list1);
  
  String pass= (String) list1.get(0); System.out.println(pass);
  
  String SQL_QUERY5 ="update CustLogin cl set cl.password='"+ pass +"' where cl.custloginid='"+ custId +"'";
  Query query5 = session.createSQLQuery(SQL_QUERY5); query5.executeUpdate();
  
  session.flush(); session.clear(); beginTransaction.commit(); }catch
  (Exception e) { e.printStackTrace(); }
  
  }
 


}

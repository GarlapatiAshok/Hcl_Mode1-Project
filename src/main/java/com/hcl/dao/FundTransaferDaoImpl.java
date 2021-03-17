/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hcl.model.AccountDetails;

@Repository("fundTransaferDao")
public class FundTransaferDaoImpl implements FundTransaferDao {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}
	
	Long frmAccNum=0L;
	Long tAccNum=0L;
	Double faccBall=0.0d;
	Double taccBall=0.0d;
	AccountDetails s=null;
	@Override
	public void fundTransfer(Long fromAccNum, Long toAccNum, Double accBal, String remarks, String txnType) {
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		
		try {
			
			String SQL_QUERY ="select accBal from AccountDetails where accnum='"+ fromAccNum +"'"; 
			 Query query = session.createQuery(SQL_QUERY);
			
			 java.util.List list = query.list();
				System.out.println(list);

				faccBall=(Double) list.get(0);
				System.out.println(faccBall);
			
				String SQL_QUERY1 ="select accBal from AccountDetails where accnum='"+ toAccNum +"'"; 
				 Query query1 = session.createQuery(SQL_QUERY1);
				
				 java.util.List list1 = query1.list();
					System.out.println(list1);

					taccBall=(Double) list1.get(0);
					System.out.println(taccBall);
					
					
					if(faccBall>=accBal) {
						
						double FromTotal = faccBall-accBal;
						double toTotal = taccBall+accBal;
						System.out.println(FromTotal);
						System.out.println(toTotal);
					 
						String SQL_QUERY2 ="update  AccountDetails ad set ad.accBal='"+FromTotal+"' where ad.accnum='"+ fromAccNum +"'";
						Query query2 = session.createSQLQuery(SQL_QUERY2);
						 query2.executeUpdate();
						 
						String SQL_QUERY3 ="update  AccountDetails ad set ad.accBal='"+toTotal+"' where ad.accnum='"+ toAccNum +"'";
						Query query3 = session.createSQLQuery(SQL_QUERY3);
						 query3.executeUpdate();
						 
						 
						 String SQL_QUERY4 ="insert into CUSTTRANSACTION(ACCNUM,DESCRIPTION,WITHDRAWL,ACCBAL,REMARKS,TXNTYPE) values("+ fromAccNum +","+ toAccNum +","+ accBal +","+ FromTotal +",'"+ remarks +"','"+ txnType +"')"; 
						 Query query4 = session.createSQLQuery(SQL_QUERY4);
						 query4.executeUpdate();						 
						 
						 
						
						 session.flush();
							session.clear();
							beginTransaction.commit();
					}
					
					
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

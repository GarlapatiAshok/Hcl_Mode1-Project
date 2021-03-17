/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository("amtWithdrawl")
public class AmtWithdrawlDaoImpl implements AmtWithdrawlDao {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}
	
	Double accBall=0.0d;
	
	@Override
	public void amtWithdrawl(Long fromAccNum, Double accBal, String txnType) {
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		try {
			
			
			String SQL_QUERY ="select accBal from AccountDetails where accnum='"+ fromAccNum +"'"; 
			 Query query = session.createQuery(SQL_QUERY);
			
			 java.util.List list = query.list();
				System.out.println(list);

				accBall=(Double) list.get(0);
				System.out.println(accBall);
				
				if(accBall>=accBal) {
					
					double FromTotal = accBall-accBal;
					System.out.println(FromTotal);
				
					String SQL_QUERY2 ="update  AccountDetails ad set ad.accBal='"+FromTotal+"' where ad.accnum='"+ fromAccNum +"'";
					Query query2 = session.createSQLQuery(SQL_QUERY2);
					 query2.executeUpdate();					
					 
					 String SQL_QUERY4 ="insert into CUSTTRANSACTION(ACCNUM,WITHDRAWL,ACCBAL,TXNTYPE) values("+ fromAccNum +","+ accBal +","+ FromTotal +",'"+ txnType +"')"; 
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

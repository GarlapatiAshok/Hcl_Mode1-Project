/*HARDCODED BY GARLAPATI ASHOK*/
package com.hcl.dao;

import java.util.Iterator;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hcl.model.CustLogin;

@Repository("custLoginDao")
public class CustLoginDaoImpl implements CustLoginDao {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public String getPassword(Long custloginid) {

		Session session = sessionFactory.openSession();
		String password = "";
		try {
			String SQL_QUERY = "from CustLogin cl where cl.custloginid='" + custloginid + "'";
			Query query = session.createQuery(SQL_QUERY);
			java.util.List list = query.list();
			System.out.println(list);
			Iterator it = query.iterate();
			while (it.hasNext()) {
				CustLogin obj = (CustLogin) it.next();
				password = obj.getPassword();
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return password;
	}


}

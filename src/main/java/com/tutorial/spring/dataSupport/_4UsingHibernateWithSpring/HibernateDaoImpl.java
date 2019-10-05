package com.tutorial.spring.dataSupport._4UsingHibernateWithSpring;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {

	@Autowired
	SessionFactory sessionFactory;

	public int getCircleCountUsingHibernate() {
		String hql = "Select count(*) from Circle";
		Query query = sessionFactory.openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
	}

}

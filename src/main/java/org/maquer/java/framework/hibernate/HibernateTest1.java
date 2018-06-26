package org.maquer.java.framework.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest1 {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	}
}

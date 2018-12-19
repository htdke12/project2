package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {
	
	private static SessionFactory sessFactory;
	
	static {
		StandardServiceRegistry standardRegistry =
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.applySetting("hibernate.connection.username", "gunpica12")
				.applySetting("hibernate.connection.password", "kobebr12").build();
		Metadata metaData =
				new MetadataSources(standardRegistry).getMetadataBuilder().build();
		sessFactory = metaData.getSessionFactoryBuilder().build();
	}
	
	public static Session getSession(){
		return sessFactory.openSession();
	}

}

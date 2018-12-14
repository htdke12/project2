package com.revature.driver;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.dao.GameTradeUserDao;
import com.revature.domain.GameTradeUser;

import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		Session tempSession = SessionUtil.getSession();
		tempSession.beginTransaction();//begin a new transaction
		
		GameTradeUser gameTradeUserList=(GameTradeUser) tempSession.createQuery("from GameTradeUser g where g.username='usern'").getSingleResult();
		
			
			System.out.println(gameTradeUserList.getStreetaddress());
		
		tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
		tempSession.close();//close the session
		
		
		
	}

}

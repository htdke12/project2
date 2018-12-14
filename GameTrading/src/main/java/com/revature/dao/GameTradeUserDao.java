package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.domain.GameTradeUser;
import com.revature.util.SessionUtil;

public class GameTradeUserDao {
	Session tempSession = SessionUtil.getSession();//will be using Spring autowiring
                                                   //create a new session from sessionutil class
public void insertIntoTable(GameTradeUser user) {
	
	tempSession.beginTransaction();//begin a new transaction
	Integer newId = (Integer) tempSession.save(user);//save to table in database, returning the newId for testing only
	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
	
}

	
	
}

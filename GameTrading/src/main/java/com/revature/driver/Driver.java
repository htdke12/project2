package com.revature.driver;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.dao.GameTradeUserDao;
import com.revature.domain.GameTradeUser;

import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		
		GameTradeUser user=new GameTradeUser(5,"usertessss","test","Street","ny","67676767676","a");
		/*Session sess = SessionUtil.getSession();
		//System.out.println("WOrked!!!");
		Transaction tx = sess.beginTransaction();
		Integer newId = (Integer) sess.save(user);
		
		//HoneyPot hp = sess.get(HoneyPot.class, 1 + newId);
		System.out.println(9999);
		tx.commit();
		sess.close();*/
		GameTradeUserDao dao= new GameTradeUserDao();
		dao.insertIntoTable(user);
		
	}

}

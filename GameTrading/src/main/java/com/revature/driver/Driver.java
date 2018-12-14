package com.revature.driver;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.dao.GameTradeUserDao;
import com.revature.dao.GamesDao;
import com.revature.domain.GameTradeUser;
import com.revature.domain.Games;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		
		
		Games gm=new Games(4,"newgame",22,"1999","y","1",99,"sadasdsad");	
	GamesDao dao =new GamesDao();
		
		dao.insertIntoTable(gm);
		
		
		
	
			
		
		
		
		
		
		
	}

}

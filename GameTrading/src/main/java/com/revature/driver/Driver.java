package com.revature.driver;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.dao.GameQualityCheckDao;
import com.revature.dao.GameTradeUserDao;
import com.revature.dao.GamesDao;
import com.revature.domain.GameQualityCheck;
import com.revature.domain.GameTradeUser;
import com.revature.domain.Games;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		
		
		GameQualityCheck gm=new GameQualityCheck(4,"newgame",2);	
		GameQualityCheckDao dao =new GameQualityCheckDao();
	
     
	dao.insertIntoTable(gm);
		
		
		
	
			
		
		
		
		
		
		
	}

}

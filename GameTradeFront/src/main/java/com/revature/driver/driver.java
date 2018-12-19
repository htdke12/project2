package com.revature.driver;

import com.revature.dao.GameQualityCheckDao;
import com.revature.domain.GameQualityCheck;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(99999);
		GameQualityCheck gm=new GameQualityCheck(4,"newgame",2);	
		System.out.println(99999);
		GameQualityCheckDao dao =new GameQualityCheckDao();
	
     
	dao.insertIntoTable(gm);
	}

}

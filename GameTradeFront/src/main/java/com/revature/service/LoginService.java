package com.revature.service;

import com.revature.dao.GameTradeUserDao;
import com.revature.domain.GameTradeUser;

public class LoginService {
	
	private GameTradeUser user;
	private GameTradeUserDao dao = new GameTradeUserDao();
	
	public GameTradeUser authenticate(GameTradeUser newuser) {
		
		
		user=dao.getUserByUsername(newuser.getUsername());
		
		
				if(user!=null) {
					
					if(user.getPass().equals(newuser.getPass())) {
						
						
						return user;
					}
				
					System.out.println("not");
				}
		
		
		
		return null;
	}
   
	 public void registerUser(GameTradeUser user) {
	    	
	    	
	    	dao.insertIntoTable(user);
	    	
	    }	
	 
	 

}
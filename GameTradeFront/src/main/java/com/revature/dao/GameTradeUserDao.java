package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
//import org.hibernate.Transaction;   //remove comment from this import if code throws error

import com.revature.domain.GameTradeUser;
import com.revature.util.SessionUtil;

public class GameTradeUserDao {
 	private Session tempSession = SessionUtil.getSession();//will be using Spring autowiring
                                                   //create a new session from sessionutil class
public void insertIntoTable(GameTradeUser user)//insert into user table
 {
	
	tempSession.beginTransaction();//begin a new transaction
	
	Integer newId = (Integer) tempSession.save(user);//save to table in database, returning the newId for testing only
	
	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	
	tempSession.close();//close the session
	
}

public GameTradeUser getUserById(int UserId)//get a user from table by id
 {
	
	
	tempSession.beginTransaction();//begin a new transaction
	
	GameTradeUser user= tempSession.get(GameTradeUser.class, UserId);//pull user with userid and make a new user obj
	
	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	
	tempSession.close();//close the session
	
	/*should be 
	surrounded with try/catch
	return null if user dosent exist*/
	return user;
	
}
	
public List<GameTradeUser> getAllGameTradeUser()//get a list of all user from table
{
		
		
		
		
tempSession.beginTransaction();//begin a new transaction	
		List <GameTradeUser> gameTradeUserList=tempSession.createQuery("from GameTradeUser").list();//hql get all statement from table
		
		tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
		tempSession.close();//close the session
		return gameTradeUserList;
		
		/*add try/catch
		return null if table dosent exist*/
	}

public GameTradeUser getUserByUsername(String username)//get a user from table by username
 {
	System.out.println(444);
	
	tempSession.beginTransaction();//begin a new transaction
	
	/*hql query 
	get record from table gametradeuser
	by username*/
	GameTradeUser gameTradeUser=(GameTradeUser) tempSession.createQuery("from GameTradeUser g where g.username='"+username+"'").getSingleResult(); 
	

	
	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
	return gameTradeUser;
	
	
	/*add try/catch
	return null if user doesn't exist*/
}

public void updatePassword(String username, String password)//update password in table by username
 {
	
	
	
tempSession.beginTransaction();//begin a new transaction
	
	
	GameTradeUser gameTradeUser=getUserByUsername(username);//get user by username
	
	gameTradeUser.setPassword(password);//set password

	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
}
public void updateStreet(String username, String street)//update street in table
 {
	
tempSession.beginTransaction();//begin a new transaction
	
	
	GameTradeUser gameTradeUser=getUserByUsername(username);//get user by username
	
	gameTradeUser.setStreetaddress(street);//set password

	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
}
public void updateState(String username, String state)//update state in the table
 {
	
tempSession.beginTransaction();//begin a new transaction
	
	
	GameTradeUser gameTradeUser=getUserByUsername(username);//get user by username
	
	gameTradeUser.setState(state);//set password

	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
}
public void updateCreditCard(String username, String card)//update card in table
{
	
tempSession.beginTransaction();//begin a new transaction
	
	
	GameTradeUser gameTradeUser=getUserByUsername(username);//get user by username
	
	gameTradeUser.setCreditcard(card);//set password

	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
}
public void updateApprove(String username, String approve)//update approval in table
{
	
tempSession.beginTransaction();//begin a new transaction
	
	
	GameTradeUser gameTradeUser=getUserByUsername(username);//get user by username
	
	gameTradeUser.setApproved(approve);//set password

	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
}
public void deleteByUsername(String username)//delete from database by username
{
	
tempSession.beginTransaction();//begin a new transaction
	
	
	GameTradeUser gameTradeUser=getUserByUsername(username);//get user by username
	
	tempSession.delete(gameTradeUser);//delete by object
//tempSession.createQuery("delete from gametradeuser where username='"+username+"'").executeUpdate();another way to perform delete
	tempSession.getTransaction().commit();//accept changes, surround with try catch to rollback on failure/exception
	tempSession.close();//close the session
	
}
}

package com.revature.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//the class is mapped to a database
@Table(name="gametradeuser")//this class is mapped to table gametradeuser in database
public class GameTradeUser {
	
    @Id                     //this variable is mapped to the primary key in column
    @Column(name ="userID")//mapped to column name userID
	private int userID; 
    
    @Column(name ="username")
	private String username;
    
    @Column(name ="pass")
	private String pass;
    
    @Column(name ="streetaddress")
	private String streetaddress;
    
    @Column(name ="state")
	private String state;
    
    @Column(name ="creditcard")
	private String creditcard;
    
	@Column(name ="approved")
	private String approved;
    
    public GameTradeUser(int userID, String username, String pass, String streetaddress, String state,
			String creditcard, String approved) {
		super();
		this.userID = userID;
		this.username = username;
		this.pass = pass;
		this.streetaddress = streetaddress;
		this.state = state;
		this.creditcard = creditcard;
		this.approved = approved;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public GameTradeUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}

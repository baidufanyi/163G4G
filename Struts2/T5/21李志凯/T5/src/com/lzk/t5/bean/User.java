package com.lzk.t5.bean;

import java.util.List;

public class User {
	private int userId;
 	private String userName;
 	private String userPassword;
 	private String userSex;
 	private int userAge;
 	private String phone;
 	private String address;
 	public User(int userId, String userName, String userPassword, String userSex, int userAge, String phone, String qQ,
 			String address) {
 		super();
 		this.userId = userId;
 		this.userName = userName;
 		this.userPassword = userPassword;
 		this.userSex = userSex;
 		this.userAge = userAge;
 		this.phone = phone;
 		this.address = address;
 	}
 	public User() {
 		super();
 		// TODO Auto-generated constructor stub
 	}
 	public int getUserId() {
 		return userId;
 	}
 	public void setUserId(int userId) {
 		this.userId = userId;
 	}
 	public String getUserName() {
 		return userName;
 	}
 	public void setUserName(String userName) {
 		this.userName = userName;
 	}
 	public String getUserPassword() {
 		return userPassword;
 	}
 	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
 	}
 	public String getUserSex() {
 		return userSex;
 	}
 	public void setUserSex(String userSex) {
 		this.userSex = userSex;
 	}
 	public int getUserAge() {
 		return userAge;
 	}
 	public void setUserAge(int userAge) {
 		this.userAge = userAge;
 	}
 	public String getPhone() {
 		return phone;
 	}
 	public void setPhone(String phone) {
 		this.phone = phone;
 	}
 	public String getAddress() {
 		return address;
 	}
 	public void setAddress(String address) {
		this.address = address;
 	}
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return null;
	}
	public User perUpdate(int userId2) {
		// TODO Auto-generated method stub
		return null;
	}
	public void del(int userId2) {
		// TODO Auto-generated method stub
		
	}
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}
 }

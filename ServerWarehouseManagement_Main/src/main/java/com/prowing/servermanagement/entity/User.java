package com.prowing.servermanagement.entity;

//@Entity
//@Table
public class User {
	
	//@Id
	//@Column(name = "User_ID")
	private int userId;
	
	//@Column(name = "User_Name")
	private String username;
	//@Column(name = "User_Password")
	private String password;
	//@Column(name = "User_Type")
	private String userType;
	//@Column(name = "User_Contact")
	private long mobilenum;
	//@Column(name = "User_Department")
	private String department;
	
	
	public User(int userId, String username, String password, String userType, long mobilenum, String department) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.mobilenum = mobilenum;
		this.department = department;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public long getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", userType=" + userType
				+ ", mobilenum=" + mobilenum + ", department=" + department + "]";
	}
	
}

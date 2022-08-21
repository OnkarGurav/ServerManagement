package com.prowing.servermanagement.service;

import com.prowing.servermanagement.entity.User;

public interface UserServiceManagement {
	
	public boolean registerUser(User user);
	
	public String validateUser(int id, String password);
	
	
}

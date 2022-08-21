package com.prowing.servermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowing.servermanagement.entity.User;

@Service
public class UserServiceManagementImpl implements UserServiceManagement {
	
	@Autowired
	RestTemplate restTemplete;
	
	@Autowired
	Environment environment;
	
	public boolean registerUser(User user) {

		String url = environment.getProperty("register_url");
		
		User isregistered  =  restTemplete.postForObject(url, user, User.class);
		if(isregistered!=null) {
			
			return true;
		} else {
			
			return false;			
		}
	}

	public String validateUser(int id, String password) {

		User user = new User();
		
		user.setUserId(id);
		user.setPassword(password);
		
		String url = environment.getProperty("validate_url2");
		
		User isregistered  = restTemplete.postForObject(url, user, User.class);
		
		System.out.println(isregistered);
		
		if(isregistered!=null) {
			
			String userType = isregistered.getUserType();
			
			return userType;
		} else {
			
			return "";			
		}
	}

}

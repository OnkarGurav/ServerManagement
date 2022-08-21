package com.prowing.servermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.prowing.servermanagement.entity.User;
import com.prowing.servermanagement.service.UserServiceManagement;

@RestController
@RequestMapping("/api")
public class UserLoginController {

	@Autowired
	UserServiceManagement userService;
	
	@PostMapping("/user")
	public ModelAndView registerUser(@RequestParam String userId, @RequestParam String username,@RequestParam String password,
									@RequestParam String userType,@RequestParam String mobilenum,@RequestParam String department) {
		User user = new User();
		
		user.setUserId(Integer.parseInt(userId));
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType(userType);
		user.setMobilenum(Long.parseLong(mobilenum));
		user.setDepartment(department);
		
		boolean isRegistered = userService.registerUser(user);

		ModelAndView model = new ModelAndView();
		model.setViewName("registered");	
		String message = null;
		if(isRegistered) {
			
			message = "User Registration Completed Successfully..!!!";
			
			model.addObject("msg", message);
			return model;
		}
		else {
			
			message = "User Registration Failed....";
			model.addObject("msg", message);
			
			return model;			
		}
	}
	
	@GetMapping("/user")
	public ModelAndView validateUser(@RequestParam String userId, @RequestParam String password) {
		
		int id = Integer.parseInt(userId);
		
		String userType = userService.validateUser(id, password);
		
		ModelAndView model = new ModelAndView();
		
		switch(userType) {
		
		case "regular" 	: 	model.setViewName("regular");
							return model;
		
		case "admin" 	:	model.setViewName("admin");
							return model;
			
		case "hepl_desk": 	model.setViewName("helpdesk");
							return model;
		
		case "team_leader": model.setViewName("teamleader");
							return model;
		
		default :			model.setViewName("invaliduser");
							return model;
		}
	}
}

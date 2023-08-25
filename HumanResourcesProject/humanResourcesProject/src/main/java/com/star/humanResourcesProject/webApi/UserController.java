package com.star.humanResourcesProject.webApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.humanResourcesProject.business.abstracts.UserService;
import com.star.humanResourcesProject.business.requests.CreateUserRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping
	public void add(@RequestBody CreateUserRequest createUserRequest) {
		this.userService.add(createUserRequest);
	}
	
	
	
	
}

package com.star.humanResourcesProject.business.abstracts;

import com.star.humanResourcesProject.business.requests.CreateUserRequest;

public interface UserService {
	
	void add(CreateUserRequest createUserRequest);
}

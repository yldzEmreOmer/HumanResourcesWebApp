package com.star.humanResourcesProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.humanResourcesProject.business.abstracts.UserService;
import com.star.humanResourcesProject.business.requests.CreateUserRequest;
import com.star.humanResourcesProject.core.utilities.mappers.ModelMapperService;
import com.star.humanResourcesProject.dataAccess.UserRepository;
import com.star.humanResourcesProject.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserRepository userRepository;
	private ModelMapperService modelMapperService;
	
	
	
	@Autowired
	public UserManager(UserRepository userRepository, ModelMapperService modelMapperService) {
		super();
		this.userRepository = userRepository;
		this.modelMapperService = modelMapperService;
	}


	@Override
	public void add(CreateUserRequest createUserRequest) {
		
		User user = this.modelMapperService.forRequest().map(createUserRequest, User.class);
		this.userRepository.save(user);
		
	}

}

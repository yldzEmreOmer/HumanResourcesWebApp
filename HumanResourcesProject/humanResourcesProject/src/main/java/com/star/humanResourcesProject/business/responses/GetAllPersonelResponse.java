package com.star.humanResourcesProject.business.responses;

import com.star.humanResourcesProject.entities.enums.Department;
import com.star.humanResourcesProject.entities.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllPersonelResponse {

private int registryNumber;
	
	private String firstName;
	
	private String lastName;
	
	private Department department;
	
	private Role role;
}

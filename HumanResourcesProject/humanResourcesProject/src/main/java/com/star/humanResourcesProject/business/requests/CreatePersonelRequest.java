package com.star.humanResourcesProject.business.requests;

import java.time.LocalDate;

import com.star.humanResourcesProject.entities.enums.Department;
import com.star.humanResourcesProject.entities.enums.Gender;
import com.star.humanResourcesProject.entities.enums.GraduationStatus;
import com.star.humanResourcesProject.entities.enums.MarialSatus;
import com.star.humanResourcesProject.entities.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePersonelRequest {
	
	private String firstName;

	private String lastName;

	private Gender gender;

	private LocalDate dateOfBirth;

	private MarialSatus marialStatus;

	private String tckn;

	private GraduationStatus graduationStatus;

	private Department department;

	private Role role;

	private boolean isWork;

	private LocalDate startingDate;

	private Role startingRole;

	private Department startingDepartment;

	private LocalDate leavingDate;

	private String leavingReason;
}

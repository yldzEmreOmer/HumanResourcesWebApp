package com.star.humanResourcesProject.entities.concretes;

import java.time.LocalDate;

import com.star.humanResourcesProject.entities.enums.Department;
import com.star.humanResourcesProject.entities.enums.Gender;
import com.star.humanResourcesProject.entities.enums.GraduationStatus;
import com.star.humanResourcesProject.entities.enums.MarialSatus;
import com.star.humanResourcesProject.entities.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personel {

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender", nullable = false)
	private Gender gender;

	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;

	@Enumerated(EnumType.STRING)
	@Column(name = "marial_status", nullable = false)
	private MarialSatus marialStatus;

	@Column(name = "tckn", nullable = false, unique = true)
	private String tckn;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registry_number")
	private int registryNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "graduation_status", nullable = true)
	private GraduationStatus graduationStatus;

	@Enumerated(EnumType.STRING)
	@Column(name = "department", nullable = false)
	private Department department;

	@Enumerated(EnumType.STRING)
	@Column(name = "role", nullable = false)
	private Role role;

	@Column(name = "is_work", nullable = false)
	private boolean isWork;

	@Column(name = "starting_date", nullable = false)
	private LocalDate startingDate;

	@Enumerated(EnumType.STRING)
	@Column(name = "starting_role", nullable = false)
	private Role startingRole;

	@Enumerated(EnumType.STRING)
	@Column(name = "starting_department", nullable = false)
	private Department startingDepartment;

	@Column(name = "leaving_date", nullable = true)
	private LocalDate leavingDate;

	@Column(name = "leaving_reason", nullable = true)
	private String leavingReason;
	
	@Lob
	@Column(name = "profil_foto", nullable = true)
	private String profilFoto;

}

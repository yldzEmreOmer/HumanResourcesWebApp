package com.star.humanResourcesProject.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.humanResourcesProject.entities.concretes.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

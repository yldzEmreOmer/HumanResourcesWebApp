package com.star.humanResourcesProject.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.humanResourcesProject.entities.concretes.PersonelInventory;

public interface PersonelInventoryRepository extends JpaRepository<PersonelInventory, Integer>{

}

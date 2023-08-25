package com.star.humanResourcesProject.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.humanResourcesProject.entities.concretes.Inventory;
import com.star.humanResourcesProject.entities.enums.InventoryType;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
	
	List<Inventory> getByType(InventoryType type);

}

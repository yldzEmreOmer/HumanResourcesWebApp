package com.star.humanResourcesProject.business.abstracts;

import java.util.List;

import com.star.humanResourcesProject.business.requests.CreateInventoryRequest;
import com.star.humanResourcesProject.business.requests.UpdateInventoryRequest;
import com.star.humanResourcesProject.business.responses.GetAllInventoryResponse;
import com.star.humanResourcesProject.entities.concretes.Inventory;
import com.star.humanResourcesProject.entities.enums.InventoryType;

public interface InventoryService {

	List<GetAllInventoryResponse> getAll();
	
	List<Inventory> getByType(InventoryType type);

	void add(CreateInventoryRequest createInventoryRequest);
	
	void update(UpdateInventoryRequest updateInventoryRequest);
	
	void delete(int id);
	
	void add2(Inventory inventory);
	
	
}

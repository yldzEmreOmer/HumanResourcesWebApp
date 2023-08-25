package com.star.humanResourcesProject.business.concretes;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.humanResourcesProject.business.abstracts.InventoryService;
import com.star.humanResourcesProject.business.requests.CreateInventoryRequest;
import com.star.humanResourcesProject.business.requests.UpdateInventoryRequest;
import com.star.humanResourcesProject.business.responses.GetAllInventoryResponse;
import com.star.humanResourcesProject.core.utilities.mappers.ModelMapperService;
import com.star.humanResourcesProject.dataAccess.InventoryRepository;
import com.star.humanResourcesProject.entities.concretes.Inventory;
import com.star.humanResourcesProject.entities.enums.InventoryStatus;
import com.star.humanResourcesProject.entities.enums.InventoryType;

@Service
public class InventoryManager implements InventoryService {

	private InventoryRepository inventoryRepository;
	private ModelMapperService modelMapperService;
	
	Inventory inventory = new Inventory(1, InventoryType.MOUSE, LocalDate.now(), "Apple", "Model1", 123, InventoryStatus.IN_OFFICE, true);
		

	@Autowired
	public InventoryManager(InventoryRepository inventoryRepository, ModelMapperService modelMapperService) {
		super();
		this.inventoryRepository = inventoryRepository;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public List<GetAllInventoryResponse> getAll() {
		List<Inventory> inventories = inventoryRepository.findAll();

		List<GetAllInventoryResponse> inventoryResponse = inventories.stream()
				.map(inventory -> this.modelMapperService.forResponse().map(inventory, GetAllInventoryResponse.class))
				.collect(Collectors.toList());
		return inventoryResponse;
	}

	@Override
	public void add(CreateInventoryRequest createInventoryRequest) {
		Inventory inventory = this.modelMapperService.forRequest().map(createInventoryRequest, Inventory.class);
		this.inventoryRepository.save(inventory);

	}

	

	@Override
	public void update(UpdateInventoryRequest updateInventoryRequest) {
		Inventory inventory = this.modelMapperService.forRequest().map(updateInventoryRequest, Inventory.class);
		this.inventoryRepository.save(inventory);
	}

	@Override
	public void delete(int id) {
		this.inventoryRepository.deleteById(id);
		
	}

	@Override
	public List<Inventory> getByType(InventoryType type) {
		
		return this.inventoryRepository.getByType(type);
	}

	@Override
	public void add2(Inventory inventory) {
		this.inventoryRepository.save(this.inventory);
		
	}
	
	

	

}

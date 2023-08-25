package com.star.humanResourcesProject.business.requests;

import java.time.LocalDate;

import com.star.humanResourcesProject.entities.enums.InventoryStatus;
import com.star.humanResourcesProject.entities.enums.InventoryType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateInventoryRequest {
	
	private int id;

	private InventoryType type;

	private LocalDate enterDay;

	private String brand;

	private String model;

	private int serialNumber;

	private InventoryStatus status;

	private boolean canBeTaken;
}

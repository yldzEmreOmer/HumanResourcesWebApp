package com.star.humanResourcesProject.business.responses;

import com.star.humanResourcesProject.entities.enums.InventoryType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllInventoryResponse {

	private InventoryType type;

	private String brand;

	private String model;

	private int serialNumber;

}

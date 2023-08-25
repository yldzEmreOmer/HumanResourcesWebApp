package com.star.humanResourcesProject.entities.concretes;

import java.time.LocalDate;



import com.star.humanResourcesProject.entities.enums.InventoryStatus;
import com.star.humanResourcesProject.entities.enums.InventoryType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "type", nullable = false)
	@Enumerated(EnumType.STRING)
	private InventoryType type;
	
	@Column(name = "enter_day", nullable = false)
	private LocalDate enterDay;
	
	@Column(name = "brand", nullable = false)
	private String brand;
	
	@Column(name = "model", nullable = false)
	private String model;
	
	@Column(name = "serial_number", nullable = false)
	private int serialNumber;
	
	@Column(name = "status", nullable = false)
	@Enumerated(EnumType.STRING)
	private InventoryStatus status;
	
	@Column(name = "can_be_taken", nullable = false)
	private boolean canBeTaken;
}

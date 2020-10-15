package com.seveneleven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.seveneleven.dto.Inventory;
import com.seveneleven.exception.RecordNotFoundException;
import com.seveneleven.model.InventoryEntity;
import com.seveneleven.repository.InventoryRepositoryImpl;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepositoryImpl inventoryRepositoryrepo;
	

	public List<InventoryEntity> getAllInventories() {
		return inventoryRepositoryrepo.getAllInventories();
	}

	public InventoryEntity getInventoryById(Long id) throws  RecordNotFoundException {
		return inventoryRepositoryrepo.getInventoryById(id);
	}

	public InventoryEntity createInventory(Inventory inventory) throws RecordNotFoundException {
		return inventoryRepositoryrepo.createInventory(inventory);
	}
	
	public InventoryEntity updateInventory(Long id) throws RecordNotFoundException {
		return inventoryRepositoryrepo.updateInventory(id);
	}

	public void deleteInventoryById(Long id) throws RecordNotFoundException {
	    inventoryRepositoryrepo.deleteInventoryById(id);
		
	}

}

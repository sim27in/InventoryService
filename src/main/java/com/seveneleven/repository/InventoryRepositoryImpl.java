package com.seveneleven.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seveneleven.dto.Inventory;
import com.seveneleven.exception.RecordNotFoundException;
import com.seveneleven.model.InventoryEntity;

@Repository
public class InventoryRepositoryImpl {

	@Autowired
	InventoryRepository repository;

	public List<InventoryEntity> getAllInventories() {
		List<InventoryEntity> inventoryList = repository.findAll();

		if (inventoryList.size() > 0) {
			return inventoryList;
		} else {
			return new ArrayList<InventoryEntity>();
		}
	}

	public InventoryEntity getInventoryById(Long id) throws RecordNotFoundException {
		Optional<InventoryEntity> inventory = repository.findById(id);

		if (inventory.isPresent()) {
			return inventory.get();
		} else {
			throw new RecordNotFoundException("No inventory record exist for given id");
		}
	}

	public InventoryEntity createInventory(Inventory inventory) throws RecordNotFoundException {
		InventoryEntity newInventory = new InventoryEntity();
		newInventory.setProductName(inventory.getProductName());
		newInventory.setProductDesc(inventory.getProductDesc());
		newInventory.setUnits(inventory.getUnits());
		newInventory.setQuantity(inventory.getQuantity());
		newInventory.setRate(inventory.getRate());
		newInventory.setCreatedDate(inventory.getCreatedDate());
		newInventory.setUpdatedDate(inventory.getUpdatedDate());
		newInventory.setRecordState(inventory.getRecordState());

		return repository.save(newInventory);
	}

	public InventoryEntity updateInventory(Long id) throws RecordNotFoundException {
		Optional<InventoryEntity> inventory = repository.findById(id);

		if (!inventory.isPresent()) {
			throw new RecordNotFoundException("No inventory record exist for given id");
		} else {

			InventoryEntity newInventory = new InventoryEntity();
			newInventory.setProductName(inventory.get().getProductName());
			newInventory.setProductDesc(inventory.get().getProductDesc());
			newInventory.setUnits(inventory.get().getUnits());
			newInventory.setQuantity(inventory.get().getQuantity());
			newInventory.setRate(inventory.get().getRate());
			newInventory.setCreatedDate(inventory.get().getCreatedDate());
			newInventory.setUpdatedDate(inventory.get().getUpdatedDate());
			newInventory.setRecordState(inventory.get().getRecordState());

			return repository.save(newInventory);
		}
	}

	public void deleteInventoryById(Long id) throws RecordNotFoundException {
		Optional<InventoryEntity> customer = repository.findById(id);

		if (customer.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No customer record exist for given id");
		}
	}
}
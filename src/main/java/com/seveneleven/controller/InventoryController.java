package com.seveneleven.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seveneleven.dto.Inventory;
import com.seveneleven.exception.RecordNotFoundException;
import com.seveneleven.model.InventoryEntity;
import com.seveneleven.service.InventoryService;

@RestController
@RequestMapping("/inventories")
public class InventoryController 
{
   @Autowired
   private InventoryService inventoryService;
    
    @GetMapping("/inventories")
    public ResponseEntity<List<InventoryEntity>> getAllInventorys() {
        List<InventoryEntity> list = inventoryService.getAllInventories();
       
 
        return new ResponseEntity<List<InventoryEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/inventory/{id}")
    public ResponseEntity<InventoryEntity> getInventoryById(@PathVariable("id") Long id) 
                                                    throws RecordNotFoundException {
        InventoryEntity entity = inventoryService.getInventoryById(id);
 
        return new ResponseEntity<InventoryEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
    @PostMapping("/addInventory")
    public ResponseEntity<InventoryEntity> createInventory(@RequestBody Inventory inventory)
                                                    throws RecordNotFoundException {
        InventoryEntity entity = inventoryService.createInventory(inventory);
        return new ResponseEntity<InventoryEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }
    
	@PutMapping("/inventory/{id}")
	public ResponseEntity<InventoryEntity> updateEmployee(@RequestBody Inventory inventory, @PathVariable long id) 
			 										throws RecordNotFoundException{

		InventoryEntity entity = inventoryService.updateInventory(id);

		return new ResponseEntity<InventoryEntity>(entity, new HttpHeaders(), HttpStatus.OK);
	    
	}
 
    @DeleteMapping("/inventory/{id}")
    public HttpStatus deleteInventoryById(@PathVariable("id") Long id) throws RecordNotFoundException {
    	inventoryService.deleteInventoryById(id);
        return HttpStatus.FORBIDDEN;
    }
}
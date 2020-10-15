package com.seveneleven.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seveneleven.model.InventoryEntity;
 

 
@Repository
public interface InventoryRepository 
        extends JpaRepository<InventoryEntity, Long> {
 
}
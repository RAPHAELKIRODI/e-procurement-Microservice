package com.inventoryservice.inventoryservice.repository;

import com.inventoryservice.inventoryservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    @Autowired
    Optional<Inventory> findBySkuCode();
}

package com.inventoryservice.inventoryservice.controller;

import com.inventoryservice.inventoryservice.repository.InventoryRepository;
import com.inventoryservice.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Controller
public class InventoryController {
  @Autowired
    private final InventoryService inventoryService;

    private final InventoryRepository inventoryRepository;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skuCode){
    return inventoryService.isInStock(skuCode);
    }
}

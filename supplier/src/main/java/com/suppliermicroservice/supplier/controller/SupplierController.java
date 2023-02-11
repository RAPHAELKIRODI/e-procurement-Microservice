package com.suppliermicroservice.supplier.controller;

import com.suppliermicroservice.supplier.dto.SupplierRequest;
import com.suppliermicroservice.supplier.dto.SupplierResponse;
import com.suppliermicroservice.supplier.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
@RequiredArgsConstructor

public class SupplierController {
@Autowired
    private final SupplierService supplierService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public  void createSupplier(@RequestBody SupplierRequest supplierRequest){
        supplierService.createSupplier(supplierRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SupplierResponse> getAllSuppliers(){

        return supplierService.getAllSuppliers();
    }
}

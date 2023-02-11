package com.suppliermicroservice.supplier.service;

import com.suppliermicroservice.supplier.dto.SupplierRequest;
import com.suppliermicroservice.supplier.dto.SupplierResponse;
import com.suppliermicroservice.supplier.model.Supplier;
import com.suppliermicroservice.supplier.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class SupplierService {
    @Autowired
    private  final SupplierRepository supplierRepository;
    public void createSupplier(SupplierRequest supplierRequest){
    Supplier supplier= Supplier.builder()
            .supplierName(supplierRequest.getSupplierName())
            .companyName(supplierRequest.getCompanyName())
            .phone(supplierRequest.getPhone())
            .city(supplierRequest.getCity())
            .build();

        if (supplier == null) {
            log.error("Cannot save a null supplier");
            throw new IllegalArgumentException("Supplier cannot be null");
        }

        supplierRepository.save(supplier);
        log.info("supplier {} is saved ",supplier.getId());

    }
    public List<SupplierResponse>getAllSuppliers(){
    List<Supplier> suppliers=supplierRepository.findAll();

        if (suppliers == null) {
            suppliers = new ArrayList<>();
        }
//        if (suppliers == null) {
//            log.error("Cannot save a null supplier");
//            throw new IllegalArgumentException("Supplier cannot be null");
//        }

    return suppliers.stream().map(this::mapToSupplierResponse).collect(Collectors.toList());    }
    private SupplierResponse mapToSupplierResponse(Supplier supplier) {
        return SupplierResponse.builder()
                .id(supplier.getId())
                .supplierName(supplier.getSupplierName())
                .companyName(supplier.getCompanyName())
                .phone(supplier.getPhone())
                .city(supplier.getCity())
                .build();
    }
}

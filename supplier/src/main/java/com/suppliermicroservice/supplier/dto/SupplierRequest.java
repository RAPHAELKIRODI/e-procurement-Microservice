package com.suppliermicroservice.supplier.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "supplier")
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class SupplierRequest {

    private  String supplierName;
    private  String companyName;
    private BigDecimal phone;
    private  String city;
}

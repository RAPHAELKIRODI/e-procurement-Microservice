package com.suppliermicroservice.supplier.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class SupplierResponse {
    @Id
    private String id;
    private  String supplierName;
    private  String companyName;
    private BigDecimal phone;
    private  String city;
}

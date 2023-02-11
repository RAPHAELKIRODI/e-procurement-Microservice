package com.suppliermicroservice.supplier.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "supplier")

public class Supplier {
    @Id
    private String id;
    private  String supplierName;
    private  String companyName;
    private BigDecimal phone;
    private  String city;
}

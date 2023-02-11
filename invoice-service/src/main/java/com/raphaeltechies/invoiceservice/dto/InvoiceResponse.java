package com.raphaeltechies.invoiceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor

public class InvoiceResponse {
@Id
    private String id;
    @Field(name = "name")
    private String customerName;
    @Field(name = "date")
    private String date ;
    @Field(name = "product")

    private String productName;
    @Field(name = "price")

    private BigDecimal price;
    @Field(name = "quantity")


    private BigDecimal quantity;
    @Field(name = "status")


    private String status;

    @Field(name = "amount")

    private BigDecimal amount;


}

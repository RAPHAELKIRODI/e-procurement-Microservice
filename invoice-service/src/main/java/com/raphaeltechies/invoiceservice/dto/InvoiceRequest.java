package com.raphaeltechies.invoiceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
@Document(value = "invoice")
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class InvoiceRequest {

    private String customerName;

    private String productName;
    private String date;

    private BigDecimal price;

    private BigDecimal quantity;

    private String status;

    private BigDecimal amount;

}

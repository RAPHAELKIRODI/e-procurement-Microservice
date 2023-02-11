package com.raphaeltechies.invoiceservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document("invoice")
public class Invoice {
    @Id
    private String id;

    private String customerName;

    private String productName;
    private String date;

    private BigDecimal price;

    private BigDecimal quantity;

    private String status;

    private BigDecimal amount;
}

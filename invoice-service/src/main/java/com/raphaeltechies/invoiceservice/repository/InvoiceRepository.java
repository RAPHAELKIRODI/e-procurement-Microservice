package com.raphaeltechies.invoiceservice.repository;

import com.raphaeltechies.invoiceservice.model.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {

}

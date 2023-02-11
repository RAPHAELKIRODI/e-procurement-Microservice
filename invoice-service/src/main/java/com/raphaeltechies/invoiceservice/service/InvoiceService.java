package com.raphaeltechies.invoiceservice.service;

import com.raphaeltechies.invoiceservice.dto.InvoiceRequest;
import com.raphaeltechies.invoiceservice.dto.InvoiceResponse;
import com.raphaeltechies.invoiceservice.model.Invoice;
import com.raphaeltechies.invoiceservice.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class InvoiceService {
    @Autowired
    private final InvoiceRepository invoiceRepository;

    public Invoice updateInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
    public void deleteInvoice(String id) {
        invoiceRepository.deleteById(id);
    }
    public void createInvoice(InvoiceRequest invoiceRequest){
        Invoice invoice=Invoice.builder()
                .customerName(invoiceRequest.getCustomerName())
                .productName(invoiceRequest.getProductName())
                .date(invoiceRequest.getDate())
                .price(invoiceRequest.getPrice())
                .quantity(invoiceRequest.getQuantity())
                .status(invoiceRequest.getStatus())
                .amount(invoiceRequest.getAmount())
                .build();

        invoiceRepository.save(invoice);
        log.info("invoice {} is saved ",invoice.getId());

    }
    public List<InvoiceResponse> getAllInvoices() {
        List<Invoice> invoices = invoiceRepository.findAll();

        return invoices.stream().map(this::mapToInvoiceResponse).toList();
}
    private InvoiceResponse mapToInvoiceResponse(Invoice invoice) {
        return InvoiceResponse.builder()
                .id(invoice.getId())
                .customerName(invoice.getCustomerName())
                .productName(invoice.getProductName())
                .date(invoice.getDate())
                .price(invoice.getPrice())
                .quantity(invoice.getQuantity())
                .status(invoice.getStatus())
                .amount(invoice.getAmount())
                .build();
    }
}

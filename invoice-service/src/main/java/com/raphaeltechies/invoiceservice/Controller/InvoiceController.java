package com.raphaeltechies.invoiceservice.Controller;
import com.raphaeltechies.invoiceservice.dto.InvoiceRequest;
import com.raphaeltechies.invoiceservice.dto.InvoiceResponse;
import com.raphaeltechies.invoiceservice.model.Invoice;
import com.raphaeltechies.invoiceservice.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoice")
@RequiredArgsConstructor

public class InvoiceController {
@Autowired
    private final InvoiceService invoiceService;

    @PutMapping("/invoices")
    public Invoice updateInvoice(@RequestBody Invoice invoice) {
        return invoiceService.updateInvoice(invoice);
    }
    @DeleteMapping("/invoices/{id}")
    public void deleteInvoice(@PathVariable String id) {
        invoiceService.deleteInvoice(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/sum")
    public  void createInvoice(@RequestBody InvoiceRequest invoiceRequest){
    invoiceService.createInvoice(invoiceRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InvoiceResponse> getAllInvoice(){

        return invoiceService.getAllInvoices();
    }
}

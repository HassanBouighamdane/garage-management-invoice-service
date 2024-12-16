package com.exemple.garagemanagementinvoiceservice.controllers;

import com.exemple.garagemanagementinvoiceservice.entities.Invoice;
import com.exemple.garagemanagementinvoiceservice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {
    private final InvoiceService invoiceService;
    @Autowired
    public InvoiceController(InvoiceService invoiceService){
        this.invoiceService=invoiceService;
    }

    @GetMapping
    public List<Invoice> getAll(){
        return invoiceService.getAll();
    }

    @PostMapping
    public Invoice generateInvoice(){
        return invoiceService.generateInvoice();
    }

    @GetMapping("/{id}")
    public Invoice getInvoice(@PathVariable Long id){
        return invoiceService.getInvoice(id);
    }

    @GetMapping
    public List<Invoice> getInvoiceByClient(@RequestParam String clientId){
        return invoiceService.getInvoiceByClient(clientId);
    }

    @GetMapping("/payment/{id}")
    public Invoice markInvoicePaid(@PathVariable Long id){
        return invoiceService.markInvoicePaid(id);
    }
}

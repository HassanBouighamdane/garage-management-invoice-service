package com.exemple.garagemanagementinvoiceservice.controllers;

import com.exemple.garagemanagementinvoiceservice.entities.Invoice;
import com.exemple.garagemanagementinvoiceservice.services.Implementation.InvoicePublisherService;
import com.exemple.garagemanagementinvoiceservice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {
    private final InvoiceService invoiceService;
    private final InvoicePublisherService invoicePublisherService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService, InvoicePublisherService invoicePublisherService){
        this.invoiceService=invoiceService;
        this.invoicePublisherService = invoicePublisherService;
    }

    @GetMapping
    public List<Invoice> getAll(){
        return invoiceService.getAll();
    }

    @PostMapping
    public String generateInvoice(@RequestBody Invoice invoice) {
        System.out.println("Received Invoice: " + invoice);
        String invoiceString = invoiceService.generateInvoice(invoice);
        invoicePublisherService.sendInvoice(invoiceString); // Publish to RabbitMQ
        return "Invoice generated and sent for processing!";
    }


    @GetMapping("/{id}")
    public Invoice getInvoice(@PathVariable Long id){
        return invoiceService.getInvoice(id);
    }


    @GetMapping("/payment/{id}")
    public Invoice markInvoicePaid(@PathVariable Long id){
        return invoiceService.markInvoicePaid(id);
    }
}

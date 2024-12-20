package com.exemple.garagemanagementinvoiceservice.services;

import com.exemple.garagemanagementinvoiceservice.entities.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getAll();
    String generateInvoice(Invoice invoice);
    Invoice getInvoice(Long id);
    Invoice markInvoicePaid(Long id);
}

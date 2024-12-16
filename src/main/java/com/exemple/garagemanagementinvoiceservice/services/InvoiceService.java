package com.exemple.garagemanagementinvoiceservice.services;

import com.exemple.garagemanagementinvoiceservice.entities.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getAll();
    Invoice generateInvoice();
    Invoice getInvoice(Long id);
    Invoice markInvoicePaid(Long id);
    List<Invoice> getInvoiceByClient(String clientId);
}

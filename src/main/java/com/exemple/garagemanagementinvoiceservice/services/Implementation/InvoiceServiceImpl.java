package com.exemple.garagemanagementinvoiceservice.services.Implementation;

import com.exemple.garagemanagementinvoiceservice.entities.Invoice;
import com.exemple.garagemanagementinvoiceservice.exceptions.BusinessException;
import com.exemple.garagemanagementinvoiceservice.repositories.InvoiceRepository;
import com.exemple.garagemanagementinvoiceservice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;
    @Autowired
    public InvoiceServiceImpl(InvoiceRepository invoiceRepository){
        this.invoiceRepository=invoiceRepository;
    }

    @Override
    public List<Invoice> getAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public String generateInvoice(Invoice invoiceDetails) {
        // Generate a simple invoice string
        String invoice = "Invoice Details:\n" +
                "Vehicle VIN: " + invoiceDetails.getVehicleVin() + "\n" +
                "Amount: " + invoiceDetails.getAmount() + "\n" +
                "Date Issued: " + invoiceDetails.getDateIssued();
        System.out.println("Generated Invoice: " + invoice);
        //invoiceRepository.save(invoiceDetails); // Save to DB
        return invoice;
    }


    @Override
    public Invoice getInvoice(Long id) {
        return null;
    }

    @Override
    public Invoice markInvoicePaid(Long id) {
        Optional<Invoice> invoice=invoiceRepository.findById(id);
        if(invoice.isEmpty()){
            throw new BusinessException("invoice not found");
        }
        return invoice.get();
    }

}

package com.exemple.garagemanagementinvoiceservice.repositories;

import com.exemple.garagemanagementinvoiceservice.entities.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvoiceRepository extends MongoRepository<Invoice,Long> {
    List<Invoice> findAllByClientId(String id);
}

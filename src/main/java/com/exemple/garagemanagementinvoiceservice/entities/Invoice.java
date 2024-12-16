package com.exemple.garagemanagementinvoiceservice.entities;
import com.exemple.garagemanagementinvoiceservice.entities.enums.Status;
import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
public class Invoice {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String clientId;
    private long taskId;
    private double amount;
    private Date dateIssued;
    private Status status;
}

package com.exemple.garagemanagementinvoiceservice.entities;
import com.exemple.garagemanagementinvoiceservice.entities.enums.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
@Getter @Setter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String vehicleVin;
    private long taskId;
    private double amount;
    private Date dateIssued;
    private String status;
}

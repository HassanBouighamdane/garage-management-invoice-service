package com.exemple.garagemanagementinvoiceservice.entities;
import com.exemple.garagemanagementinvoiceservice.entities.enums.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
@Getter @Setter
public class Invoice {
    @Id
    private Long id;

    private String clientId;
    private long taskId;
    private double amount;
    private Date dateIssued;
    private Status status;
}

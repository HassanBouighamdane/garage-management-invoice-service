package com.exemple.garagemanagementinvoiceservice.services.Implementation;

import com.exemple.garagemanagementinvoiceservice.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoicePublisherService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendInvoice(String invoice) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.INVOICE_EXCHANGE, RabbitMQConfig.INVOICE_ROUTING_KEY, invoice);
        System.out.println("Invoice published to RabbitMQ: " + invoice);
    }
}


package com.exemple.garagemanagementinvoiceservice.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String INVOICE_QUEUE = "invoiceQueue";
    public static final String INVOICE_EXCHANGE = "invoiceExchange";
    public static final String INVOICE_ROUTING_KEY = "invoiceRoutingKey";

    @Bean
    public Queue queue() {
        return new Queue(INVOICE_QUEUE, true); // durable queue
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(INVOICE_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(INVOICE_ROUTING_KEY);
    }
}


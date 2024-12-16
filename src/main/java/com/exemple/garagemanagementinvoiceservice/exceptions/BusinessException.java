package com.exemple.garagemanagementinvoiceservice.exceptions;

public class BusinessException extends RuntimeException {
    private String message;
    public BusinessException(String message) {
        this.message=message;
    }
}

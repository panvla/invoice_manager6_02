package com.vladimirpandurov.invoice_manager6_02.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}

package com.example.exception;

public class NoSuchCustomerExistsException extends RuntimeException{
    public NoSuchCustomerExistsException(){
    }
    public NoSuchCustomerExistsException(String message){
        super(message);
    }
}

package com.example.exception;

public class NoSuchCustomerExistsException extends RuntimeException{
    public NoSuchCustomerExistsException(){
        super("No such customer is exits!");
    }
    public NoSuchCustomerExistsException(String message){
        super(message);
    }
}

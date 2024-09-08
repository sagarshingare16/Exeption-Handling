package com.example.exception;

public class CustomerAlreadyExistsException extends RuntimeException{
    public CustomerAlreadyExistsException(){
        super("Customer already exits!");
    }
    public CustomerAlreadyExistsException(String message){
        super(message);
    }
}

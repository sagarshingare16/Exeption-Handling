package com.example;

public class ValidateAgeException extends RuntimeException{
    public ValidateAgeException(){
        super("Not eligible to vote!");
    }
    public ValidateAgeException(String message){
        super(message);
    }
}

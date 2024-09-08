package com.example;

public class ValidateAgeException extends RuntimeException{
    public ValidateAgeException(){

    }
    public ValidateAgeException(String message){
        super(message);
    }
}

package com.example;

public class ValidateAgeException extends Exception{
    public ValidateAgeException(){
        super("Not eligible to vote!");
    }
    public ValidateAgeException(String message){
        super(message);
    }
}

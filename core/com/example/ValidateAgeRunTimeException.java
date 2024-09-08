package com.example;

public class ValidateAgeRunTimeException extends RuntimeException{
    public ValidateAgeRunTimeException(){
        super("Not eligible!");
    }
    public ValidateAgeRunTimeException(String message){
        super("Not eligible");
    }
}

package com.example;

public class ThrowExample {
    public static void main(String[] args) {
        /*try {
            System.out.println(validateAge(17));
        }
        catch (ValidateAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Next statement!");*/

        try {
            System.out.println(validateAge(19));
        }catch (ValidateAgeRunTimeException ex){
            System.out.println(ex.getMessage());
        }
    }
    /*public static String validateAge(int age) throws ValidateAgeException {   // if we are using custom exception by extending Exception class
        if(age<18){
            throw new ValidateAgeException("You are not eligible to vote!");
        }else {
            return "Eligible to vote!";
        }
    }*/

    public static String validateAge(int age){
        if(age<18){
            throw new ValidateAgeRunTimeException();   //// if we are using custom exception by extending RuntimeException class
        }else {
            return "Eligible to vote!";
        }
    }
}

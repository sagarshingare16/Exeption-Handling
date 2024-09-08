package com.example;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            System.out.println(validateAge(17));
        }
        catch (ValidateAgeException e){
            System.out.println(e.getMessage());
        }
    }
    public static String validateAge(int age){
        if(age<18){
            throw new ValidateAgeException("You are not eligible to vote!");
        }else {
            return "Eligible to vote!";
        }
    }
}

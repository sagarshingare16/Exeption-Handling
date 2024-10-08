package com.example;

public class PracticeMain {
    public static void main(String[] args) {
        int[] numerator = {24, 5, 6, 7};
        int[] denominator = {6, 57, 0, 56};
        try {
            for (int i = 0; i < denominator.length; i++) {
                System.out.println(divide(numerator[i], denominator[i]));
            }
        }catch (ArithmeticException ex){
            System.out.println(ex+ " :: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex+ " :: " + ex.getMessage());
            System.out.println("Generic exception!");
        }
        System.out.println("Next statement!");
    }
    public static int divide(int a, int b){
        return a/b;
        }
}

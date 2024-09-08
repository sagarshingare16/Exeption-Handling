package com.example;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("example.txt")){
            int character;
            while ((character = reader.read())!=-1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file :: "+ e.getMessage());
        }
    }
}

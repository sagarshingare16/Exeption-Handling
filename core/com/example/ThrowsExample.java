package com.example;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("example.txt")) {
            readFile(reader);
        }catch (IOException ex){
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
    public static void readFile(FileReader reader) throws IOException{
        int character;
        while ((character = reader.read())!=-1){
            System.out.print((char) character);
        }
    }
}

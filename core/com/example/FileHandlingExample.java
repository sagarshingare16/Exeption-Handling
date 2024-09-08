package com.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            File file = new File("example.txt");
            reader = new FileReader(file);
            int character;
            while ((character = reader.read())!=-1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file :: "+ e.getMessage());
        } catch (Exception ex){
            System.out.println("An error occurred in program :: "+ex.getMessage());
        }
        finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the file reader :: " + e.getMessage());
                }
            }
        }
    }
}

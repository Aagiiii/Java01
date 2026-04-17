package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class WriteFileDemo {
    
    public void Writer(){

        try 
            (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
                writer.write("Hello, World");
                writer.newLine();
                writer.write("This is line 2");

                System.out.println("File written successfully!");
            }
         catch (IOException e) {
            System.out.println("Error; " + e.getMessage());
        }
    }

    public void Appender(){
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("log.txt", true))){
            wr.write("New log entry");
            wr.newLine();
        } catch (IOException e) {
            e.printStackTrace(); 
            // TODO: handle exception
        }
    }
}

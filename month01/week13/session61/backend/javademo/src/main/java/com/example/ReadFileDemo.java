package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadFileDemo {
    

    public void readFile(){
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            

        } catch (IOException e) {
           System.out.println("Error; " + e.getMessage());
        }
    };
}


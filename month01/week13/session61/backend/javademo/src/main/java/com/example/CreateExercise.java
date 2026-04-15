
package com.example;

import java.io.File;
import java.io.IOException;


public class CreateExercise {
    
    public void createFile(){
        try {
            File file = new File("output.txt");
            boolean fileCreated = file.createNewFile();

            File dir = new File("reports");
            boolean dirCreated = dir.mkdir();

            File nested = new File("data/2026/april");
            boolean nestedCreated = nested.mkdirs();

        } catch (Exception e) {
          System.out.println("error: " + e.getMessage());
        }
    }
}

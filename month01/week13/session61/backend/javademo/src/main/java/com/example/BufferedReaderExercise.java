package com.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExercise {
    
    public void bufferedReader(){
        // try-with-resources ашиглан файл унших
        try (BufferedReader reader = new BufferedReader(new FileReader("reports.txt"))) {
            String line;
            int lineCount = 0;

            // Мөр мөрөөр унших
            while ((line = reader.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + line);
            }

            System.out.println("Нийт мөр: " + lineCount);

        } catch (IOException e) {
            System.out.println("Алдаа: " + e.getMessage());
        }
    }
}

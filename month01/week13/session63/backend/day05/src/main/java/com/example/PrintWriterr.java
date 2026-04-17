package  com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class PrintWriterr {
    

    public void PrintWr(){
        try(PrintWriter wr = new PrintWriter(new FileWriter("output1.txt"))) {
            wr.println("Line 1");
            wr.println("Line 2");
            wr.printf("Name; %s,  Age; %d%n", "John", 26);
            wr.printf("Price: $%.2f%n", 19.99);
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}

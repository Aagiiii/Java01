
package mn.icode;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class FileWriterExample {
    public static void main(String[] args) {
        // BufferedReader reader;
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("notes.txt", false));
            writer.write("First Line");
            writer.newLine();
            writer.write("Second line");
            writer.newLine();
            writer.write("Third Line");
            writer.newLine();
           System.out.println("File successfully written");
        } catch (Exception e) {
            // TODO: handle exception
             System.out.println("Error occured " + e.getMessage());
           
        }finally{
            if (writer!=null) {
                try {
                    writer.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Error during file close " + e.getMessage());
                }
            }
        }
    }
}

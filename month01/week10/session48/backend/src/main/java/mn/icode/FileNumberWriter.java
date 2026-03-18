package mn.icode;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileNumberWriter {
    public static void main(String[] args) {
          BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("numbers.txt", false));
            for (int i = 1; i <=100; i++) {
                writer.write(String.valueOf(i));
                writer.newLine();
            }
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

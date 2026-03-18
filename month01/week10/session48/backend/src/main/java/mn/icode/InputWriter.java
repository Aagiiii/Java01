package mn.icode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class InputWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         BufferedWriter writer = null;
        // input = sc.next();

        try {
            System.out.println("Please give me input");
            String input = sc.nextLine();
            writer = new BufferedWriter(new FileWriter("input.txt", false));
            writer.write(input);
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
        sc.close();
    }
    
}

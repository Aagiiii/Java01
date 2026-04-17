package  com.example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileCopyDemo {
    
    public void Fcopy(){
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("output.txt")); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("desc.txt"))){
            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied");
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}

package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class FilesWriteDemo {
    public void FW(){
        try {
            Files.writeString(Path.of("output2.txt"), "hello w");

            Files.writeString(Path.of("output2.txt"), "\nAppended line", StandardOpenOption.APPEND);
        } catch (IOException e) {

            e.printStackTrace();
            // TODO: handle exception
        }
    }
}

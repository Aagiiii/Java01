package com.example;

import java.io.File;
import java.io.IOException;

public class CreateDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("newfile.txt");
    boolean created = file.createNewFile();

    File dir = new File("myFolder");
    dir.mkdir();

    File nested = new File("a/b/c");
    nested.mkdirs();
    }
    

}

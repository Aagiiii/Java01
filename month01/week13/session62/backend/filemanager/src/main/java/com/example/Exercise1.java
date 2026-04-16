package com.example;

import java.io.File;

public class Exercise1 {
    
    public void getFileInfo(String filename){

        File fn = new File(filename);
        if (fn.exists()) {
            System.out.println(fn.length() + "bytes");
            System.out.println(fn.getName());
            System.out.println(fn.getAbsolutePath());
        } else{
            System.out.println("File doesn't exist");
        }

    }
}

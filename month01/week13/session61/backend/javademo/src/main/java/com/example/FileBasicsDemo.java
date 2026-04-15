package com.example;

import java.io.File;

public class FileBasicsDemo {
    public static void main(String[] args) {
        
        // File file = new File("example.txt");

        // // check
        // System.out.println("Exists:" + file.exists());
        // System.out.println("Is file:" + file.isFile());
        // System.out.println("Is directory: " + file.isDirectory());

        // // get info

        // System.out.println("Name: " + file.getName());
        // System.out.println("Pathe: " + file.getAbsolutePath());
        // System.out.println("Size: " + file.length()+ "bytes");


              // 1. File объект үүсгэх
        File myFile = new File("data.txt");

        // 2. Файл байгаа эсэхийг шалгах
        if (myFile.exists()) {
            System.out.println("File байна!");
        }

        // 3. Файл уу директор уу гэдгийг шалгах
        if (myFile.isFile()) {
            System.out.println("Энэ бол файл");
        } else if (myFile.isDirectory()) {
            System.out.println("Энэ бол директор");
        }

        // 4. Файлын мэдээлэл авах
        System.out.println("Нэр: " + myFile.getName());
        System.out.println("Хэмжээ: " + myFile.length() + " bytes");
    }
}

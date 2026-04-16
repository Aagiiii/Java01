package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Exercise1 ex = new Exercise1();
        // URL resource = Main.class.getResource("/employee.txt");
        // System.out.println(resource);
        // ex.getFileInfo("/Users/malacca/Desktop/gg/month01/week13/session62/backend/filemanager/target/classes/employee.txt");
        // System.out.println(resource.getFile());
        ex.getFileInfo("employee.txt");
    }
}
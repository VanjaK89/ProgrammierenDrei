package com.company;

import java.io.File;

public class UebungZwei {
    public static void main(String[] args) {
        File file = new File("C:\\");
   listF(file.getAbsolutePath());
    }

        public static void listF(String path){
            File root = new File(path);
            File[] list = root.listFiles();

            for (File f : list) {
                if (f.isDirectory()) {
                    System.out.println("Dir: " + f.getAbsoluteFile());
                } else {
                    System.out.println("File: " + f.getAbsoluteFile());
                }
            }


        }



}
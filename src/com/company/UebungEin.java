package com.company;

import java.io.File;
import java.io.IOException;

public class UebungEin {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\s51637\\Desktop\\UebungEin\\uebung.txt");

        System.out.println(file.getPath());

        if(file.createNewFile()){
            System.out.println("New File");
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());

        }
        else
        {
            System.out.println(" Does this file exist? " + true);
            System.out.println("The name of the file is " + file.getName());
            System.out.println("Parent directory of this file " + file.getParentFile());
            System.out.println("Path to this file " + file.getPath());
            System.out.println("The full Path to this file " + file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
        }

    }
}

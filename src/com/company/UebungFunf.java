package com.company;

import java.io.File;
import java.io.IOException;

public class UebungFunf {
    public static void main(String[] args) throws IOException {



       File dir = new File("C:\\Users\\s51637\\Desktop\\neutest");
       createDirectories(dir);

    }
    public static void createDirectories(File f){
        if(f.isDirectory()){
            System.out.println("Directory " + f.getAbsolutePath() + "created? " + f.mkdirs());
        }
        else{
            System.out.println("Directory " + f.getAbsolutePath() + "created? " + f.mkdirs());
        }
    }
}

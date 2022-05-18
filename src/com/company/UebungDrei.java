package com.company;

import java.io.File;

public class UebungDrei {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\s51637\\Desktop\\Project1");
        System.out.println("Original path: " + dir.getAbsolutePath());
        listFilesAndDirectoriesWithSubFolders(dir.getAbsolutePath());

    }

    public static void listFilesAndDirectoriesWithSubFolders(String paths){

       File file = new File(paths);
       File [] some = file.listFiles();

       if(some == null) return;

        for (File f : some) {
            if (f.isDirectory()) {
                System.out.println("Dir: " + f.getAbsoluteFile());
                listFilesAndDirectoriesWithSubFolders(f.getAbsolutePath());
            } else {
                System.out.println("File: " + f.getAbsoluteFile());
            }
        }
    }
}

package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class UebungSechs {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\s51637\\Desktop\\UebungSechs");
        createFiles(dir);
        rename_files(dir);
        delete_files(dir);
    }

    public static void createFiles(File fileList) throws IOException {
        for (int i = 0; i < 10; i++) {
            File file = new File(fileList.getAbsolutePath() + "//" + ThreadLocalRandom.current().nextInt() + "mp3");
            if (file.createNewFile()) {
                System.out.println("Create " + file.getAbsolutePath());
            } else {
                System.out.println("is created");
            }
        }

    }

    public static void rename_files(File directory) {
        if (directory.isDirectory()) {
            for (File oldFile : directory.listFiles()) {
                File newFile = new File(oldFile.getParent() + "\\1_" + oldFile.getName());
                if (oldFile.renameTo(newFile)) {
                    System.out.println("RENAME:" + oldFile.getAbsolutePath() + " to " + newFile.getAbsolutePath());
                } else {
                    System.out.println("Sorry! The file cannot be renamed");
                }
            }
        }
    }

    public static void delete_files(File directory) {
        if (directory.isDirectory()) {

            for (File myFile : directory.listFiles()) {

                if (myFile.delete()) {
                    System.out.println("Deleted the file: " + myFile.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }


            }
        }

    }
}

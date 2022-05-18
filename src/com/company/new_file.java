package com.company;

import java.io.File;
import java.io.IOException;

public class new_file {
    public static void main(String[] args) throws IOException {

        String fileSeparator = System.getProperty("file.separator");
        System.out.println("File Separator: " + fileSeparator);





        File file = new File("C:\\Users\\s51637\\Desktop\\text.txt");
        File file2 = new File("C: " + fileSeparator + "Users" + fileSeparator + "s51637" + fileSeparator + "Desktop" + fileSeparator + "text.txt");

        File html = new File("test.html");

        if (file.createNewFile()) {
            System.out.println("new File");
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());


        }
        {
            System.out.println("already exist");
        }
    }
}
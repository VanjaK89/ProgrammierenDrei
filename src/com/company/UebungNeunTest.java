package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UebungNeunTest {
    public static void main(String[] args) throws IOException {

        File file = new File("testFile.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("This is a test. And we test some changes ");
        printWriter.println("This is another test. On already made text File");
        printWriter.print("And another Test without ln");
        printWriter.format("This is a Java program with 100 MB", "JAVA", 100);

        printWriter.flush();
        printWriter.close();
        System.out.println("And we are done!");

    }
}

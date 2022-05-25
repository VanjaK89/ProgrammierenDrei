package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UebungNeun {
    public static void main(String[] args) throws IOException {
        File file = new File("25-05.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        String java= "ffff";
        printWriter.println("Zeile 3");
        printWriter.println("Zeile 5");
        printWriter.print("ohneLN");
        printWriter.print("ohneLN");
        printWriter.println("Zeile 3");
        printWriter.println("Zeile 4");
        printWriter.format("This is a %s program with %d MB", java, 100); // there is another way "JAVA" as a string
        printWriter.print("This is a JAVA Program with 100MB");

        printWriter.flush();
        printWriter.close();
        System.out.println("Fertig"); //das wir wissen wo wir uns befinden

    }
}

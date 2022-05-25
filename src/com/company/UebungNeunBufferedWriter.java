package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UebungNeunBufferedWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("test25-05.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Zeile 1");
        bufferedWriter.newLine();
        bufferedWriter.write("Zeile 2");
        bufferedWriter.newLine();
        bufferedWriter.write("Zeile 3");
        bufferedWriter.newLine();

        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("DONE");

    }
}

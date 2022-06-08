package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class UebungVierzehn1 {
    public static void main(String[] args) throws FileNotFoundException {

        String s = "This a new test!";
        PrintStream output = new PrintStream("test.dat");
        output.print(s);
        output.println(s);
        output.flush();
        output.close();


    }
}

package com.company;

import java.io.IOException;
import java.io.StringWriter;

public class UebungNeunStringWriter {
    public static void main(String[] args) throws IOException {

        String data = "das sind neue Daten";

        StringWriter stringWriter = new StringWriter();
        stringWriter.write(data);
        stringWriter.write("Hi");
        stringWriter.flush();
        stringWriter.close();

        System.out.println(stringWriter);

    }
}

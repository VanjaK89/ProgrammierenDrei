package com.company;

import java.io.*;

public class UebungSechzehn {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String s = "Hello World";
        byte[] b;

        File file = new File("object.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //ich schreibe Objecte mit objectOutputStream, nicht satz oder nummern
        objectOutputStream.writeObject(s);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("object.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        System.out.println("String: " + (String) objectInputStream.readObject());

        objectInputStream.close();


    }
}

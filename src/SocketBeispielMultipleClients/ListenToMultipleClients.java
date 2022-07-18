package SocketBeispielMultipleClients;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListenToMultipleClients {
    public static void main(String[] args) {

        List<Thread> clients = new ArrayList<>();
        System.out.println("Starte Server ...");
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9090);
            serverSocket.setSoTimeout(30000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                Socket socket = serverSocket.accept();
                Thread tr1 = new Thread(new MultipleClients(socket));
                tr1.start();
                clients.add(tr1);

            } catch (SocketTimeoutException e) {
                System.out.println("Server TIMEOUT");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        for (Thread t: clients){
            try {
                t.join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("ENDE");
    }

}

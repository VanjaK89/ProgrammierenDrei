package SocketBeispielMultipleClients;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class MultipleClients implements Runnable{
    public static void main(String[] args) {

    }
        private Socket socket;

         public MultipleClients(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
        Thread.currentThread().setName("Client Port " + socket.getPort());
            System.out.println(Thread.currentThread().getName() + "wurde gestartet.");
            try {

                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write("HELLO");
                bufferedWriter.newLine();
                bufferedWriter.flush();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(Thread.currentThread().getName() + "führt folgendes komando aus: " + line);

                    if ("TIME".equals(line)) {
                        Date date = new Date();
                        bufferedWriter.write(date.toString());
                        bufferedWriter.newLine();   //obavezno new line napisati
                        bufferedWriter.flush();
                    } else if ("PORT".equals(line)) {
                        bufferedWriter.write("remote port" + socket.getPort());
                        bufferedWriter.write("Port: " + socket.getLocalPort());
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    } else if ("END".equals(line)) {
                        bufferedWriter.write("Ende");
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                        break; //moramo izaci iz while schleife sa break inace ne mozemo drugacije izaci
                    } else {
                        bufferedWriter.write("Unknown command");
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                }
                bufferedWriter.close();
                bufferedReader.close();
                System.out.println(Thread.currentThread().getName() + "Server wurde beendet");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


}


package UebungZweiThreads;

import UebungThread1.ConsoleLittleHelper;
import UebungThread1.Worker;

public class Main {
    public static void main(String[] args) {
        Workers w1 = new Workers();
        Workers w2 = new Workers();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();

        System.out.println("Drücken Sie eine Taste um zu stoppen ...");
        if (ConsoleHelper.readLine() != null) {
            w1.requestShutDown();
        }
        if (ConsoleHelper.readLine() != null) {
            w2.requestShutDown();
        }

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fertig!");
    }
}




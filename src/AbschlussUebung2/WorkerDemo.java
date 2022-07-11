package AbschlussUebung2;

import java.util.TreeMap;

public class WorkerDemo {
    public static void main(String[] args) {
        TimePrintWorker timePrintWorker = new TimePrintWorker("TimePrintWorker");
        FileReadWorker fileReadWorker = new FileReadWorker("FileReadWorker", "text.txt");

        Thread t1 = new Thread(timePrintWorker);
        Thread t2 = new Thread(fileReadWorker);

        t1.start();
        t2.start();

        try{
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        timePrintWorker.stopWorker();
        try{
            t1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Fertig mit allen Arbeiten");
    }
}

package UebungZweiThreads;

import java.util.Date;
import java.util.Date;
import java.util.SortedMap;
public class Workers implements Runnable {

    private final int sleepInterval = 1000;
    private boolean isRunning = true;
    public void requestShutDown() {
        isRunning = false;
    }

    private static Object lock = new Object();
    @Override
    public void run() {
        synchronized (lock) {
            while (isRunning) {
                Date d = new Date();
                System.out.print("[");
                System.out.println(Thread.currentThread().getName() + " ");
                System.out.print(d.toString());
                System.out.print(", CPUS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");
                System.out.println();
                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



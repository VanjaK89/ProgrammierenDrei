package UebungThread1;

import java.util.Date;

public class Worker implements Runnable{

    private final int sleepInterval = 1000;


    public int getSleepInterval() {
        return sleepInterval;
    }

    @Override
    public void run() {
       while(true){
           Date currentDate = new Date();
           System.out.println(currentDate.toString());
           try {
               Thread.sleep(sleepInterval);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
}

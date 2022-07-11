package AbschlussUebung2;

import java.util.Date;

public class TimePrintWorker extends Worker{
    private final int timeInterval = 1000;
    private int counter = 0;
    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            work();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void work() throws InterruptedException {
         printStarted();
        while(shouldRun ){
            Date d = new Date();
            System.out.println(d.toString());
            Thread.sleep(timeInterval);
        }
        printStopped();

    }
}

package UebungThread1;

import java.util.Date;

public class Worker implements Runnable {
    private boolean isRunning = true;
    private final int sleepInterval = 1000;

    public void requestShutDown() {
        isRunning = false;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (isRunning) {
                Date currentDate = new Date();
                System.out.println(currentDate.toString());
                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }
}

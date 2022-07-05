package ThreadWithCounter;

import java.util.Date;

public class People implements Runnable{
        private final int sleepInterval = 1000;
        private int counter = 0;
        private static Object lock = new Object();

        @Override
        public void run() {
            synchronized (lock) {
                    while(counter < 20){
                        lock.notifyAll();
                        counter++;
                        System.out.print("[");
                        System.out.print(Thread.currentThread().getName() + " " + " counter: " + counter);
                        System.out.println("]");
                        try {
                            Thread.sleep(sleepInterval);
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                System.out.println("The End");

            }
        }

}






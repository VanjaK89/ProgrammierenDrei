package Eample1Thread1.Eample1Thread;

public class Person implements Runnable {


    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            // while (isRunning) is one of many options
            for (int i = 0; i < 10; i++) {
                System.out.print("[");
                System.out.print(getName() + " " + Thread.currentThread().getName());
                System.out.println("]");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
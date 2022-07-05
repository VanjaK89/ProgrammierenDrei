package Eample1Thread;

public class Person implements Runnable {

    private boolean isRunning = true;
    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void requestShutDown() {
        isRunning = false;
    }
    @Override
    public void run() {
        // while (isRunning) is one of many options
        for (int i = 0; i < 10; i++) {
            if (isRunning) {
                System.out.println(getName() + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }
}
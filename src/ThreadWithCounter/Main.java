package ThreadWithCounter;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        Thread t1 = new Thread(people);
        Thread t2 = new Thread(people);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }


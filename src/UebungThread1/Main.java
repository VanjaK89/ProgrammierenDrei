package UebungThread1;

public class Main {
    public static void main(String[] args){

        Worker w1 = new Worker();
        Thread t1 = new Thread(w1);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ende");
    }
}

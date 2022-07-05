package UebungThread1;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println("Bitten drücken Sie eine Taste um Threads zu stoppen");
        if (ConsoleLittleHelper.readLine() != null) {
            w1.requestShutDown();

            System.out.println(t1.getState());

        }
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ende");
    }
}
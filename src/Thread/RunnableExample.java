package Thread;

public class RunnableExample implements Runnable{
    public static void main(String[] args) {

        System.out.printf("Thread 1: " + Thread.currentThread().getName());
        System.out.println("Create runnable");
        Runnable runnable = new RunnableExample();

        System.out.println("create thread");
        Thread thread = new Thread(runnable);
        System.out.println(thread.getName());

        System.out.println("start Thread");
        thread.start();
    }
    @Override
    public void run() {
        System.out.printf("Tread: " + Thread.currentThread().getName());
    }
}

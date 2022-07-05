package Thread;

public class SingleThread {
    public static void main(String[] args) {

        System.out.printf("Thread: " + Thread.currentThread().getName());
        System.out.printf("Thread: " + Thread.currentThread().getId());
    }
}

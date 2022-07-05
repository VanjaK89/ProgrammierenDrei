package Eample1Thread1.Eample1Thread;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Person 1");
        Person person2 = new Person("Person 2");

        Thread t1 = new Thread(person1);
        Thread t2 = new Thread(person2);

        t1.start();
        t2.start();
        //wir schauen was passiert im thread drinnen
        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println("Bitten drücken Sie eine Taste um Threads zu stoppen");
        if(ConsoleHelper.readLine() != null){
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        }
        try {
            t1.join();
            t2.join();
            System.out.println(t1.getState());
            System.out.println(t2.getState());

            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ende");



    }
}
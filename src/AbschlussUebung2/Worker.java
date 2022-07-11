package AbschlussUebung2;

public abstract class Worker implements Runnable {

    protected String name;
    protected boolean shouldRun;

    public Worker(String name) {
        this.name = name;
        shouldRun = true;
    }
    protected abstract void work() throws InterruptedException;

    protected void printStarted(){
        System.out.println("wurde gestartet");
    }
    protected void printStopped(){
        System.out.println("wurde gestoppt");
    }
    public void stopWorker(){
        shouldRun = false;
    }



}

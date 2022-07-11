package AbschlussUebung2;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Worker implements Runnable {

    protected String name;
    protected boolean shouldRun;

    public Worker(String name) {
        this.name = name;
        shouldRun = true;
    }
    protected abstract void work() throws InterruptedException, IOException;

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

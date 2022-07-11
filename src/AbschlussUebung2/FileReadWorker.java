package AbschlussUebung2;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Worker {
    private String path;
    public ArrayList<String> lines;
    public FileReadWorker(String name, String path) {
        super(name);
        this.path = path;
        lines = new ArrayList<>();
    }

    @Override
    public void run() {
          try{
              work();
          }catch (InterruptedException | IOException e){
              e.printStackTrace();
          }
    }

    @Override
    protected void work() throws IOException, InterruptedException {
          printStarted();
        FileReader fr = new FileReader(new File(path));
        BufferedReader bf = new BufferedReader(fr);
        String templine;

        while((templine = bf.readLine()) != null){
            if(!shouldRun)
                break;
            lines.add(templine);
            System.out.println(templine);
            Thread.sleep(100);
        }
        bf.close();
        printStopped();
    }

}


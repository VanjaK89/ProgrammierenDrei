package BeispielEinz;

import java.io.File;
import java.io.IOException;

public class DemoClass {
    public static void main(String[] args) throws AddressExportException, AddressExportFileAlreadyExistException, IOException, AddressLoadException, AddressLoadWrongFormatException {

        AddressManager addressManager = new AddressManager();
        String separator = ",";
        String path = "test.csv";

        Address a1 = new Address("Robert", "Leitener", "+43098988", "robert.leitner.com");
        Address a2 = new Address("Ana", "Leitener", "+43098988", "ana.leitner.com");
        Address a3 = new Address("Susi", "Leitener", "+43098988", "susi.leitner.com");
        Address a4 = new Address("Max", "Leitener", "+43098988", "max.leitner.com");

        addressManager.add(a1);
        addressManager.add(a2);
        addressManager.add(a3);
        addressManager.add(a4);

        System.out.println();
        addressManager.exportToCsv(path, separator);
        System.out.println();


        try{
            addressManager.loadFromCsv(path, separator);
        }
        catch (AddressLoadWrongFormatException e){
            e.printStackTrace();
        }
//        System.out.println(addressManager.getAddresses().toString());

    }
}

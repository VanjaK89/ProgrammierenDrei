package BeispielEinz;

import com.sun.jdi.request.ClassUnloadRequest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {

    private ArrayList<Address> addresses = new ArrayList<>();

    public AddressManager() {
        this.addresses = addresses;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }


    public void add(Address a) {
        addresses.add(a);
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistException {

//            File file = new File(path);
//            if(file.exists()) {
//                throw new AddressExportFileAlreadyExistException("File existiert bereits");
//            }


        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Address a : getAddresses()) {
                bufferedWriter.write(a.getFirstName() + separator + a.getLastname() + separator + a.getMobilNumber() + separator + a.getEmail());
                bufferedWriter.newLine();
                System.out.println("Write to file: " + a);
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("File created and saved!");
        } catch (IOException e) {
            throw new AddressExportException(e);
        }

    }

    public List<Address> loadFromCsv(String path, String separator) throws AddressLoadException, AddressLoadWrongFormatException {
        ArrayList<Address> arrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] tempArr = line.split(separator);
               if(tempArr.length != 4) {
                   throw new AddressLoadWrongFormatException("4 Spalten erwartet");
               }
                arrayList.add(new Address(tempArr[0], tempArr[1], tempArr[2], tempArr[3]));

            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new AddressLoadException(e);

        }
        System.out.println(arrayList);
      return arrayList;
    }
}
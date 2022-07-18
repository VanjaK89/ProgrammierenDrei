package UrlPackage;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class postRequest {
    public static void main(String[] args) {

        String email = "";
        String password = "";
        URL url = null;
        try {
            url = new URL("https//campus02");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoOutput(true);

            String parameter = "username= " + email + "password " + password;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
            outputStreamWriter.write(parameter);
            outputStreamWriter.flush();

            System.out.println(httpURLConnection.getResponseCode());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
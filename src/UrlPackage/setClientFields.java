package UrlPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class setClientFields {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.campus02.at");

            URLConnection urlConnection = url.openConnection();

            System.out.println(urlConnection.getRequestProperties());
            urlConnection.setRequestProperty("User-Agent", "Java Client Vanja");
            urlConnection.setRequestProperty("Accept-Language", "en-US");
            urlConnection.setRequestProperty("Accept", "text/html");
            System.out.println(urlConnection.getRequestProperties());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

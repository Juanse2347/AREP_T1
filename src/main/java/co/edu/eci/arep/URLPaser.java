package co.edu.eci.arep;

import java.net.MalformedURLException;
import java.net.URL;

public class URLPaser {

    public static void main(String[] args) throws MalformedURLException {
        URL site = new URL("http://ldbn.escuelaing.edu.co:8765/index.html?v=456ty=67#eventos");

        System.out.println("Protocol: " + site.getProtocol());
        System.out.println("Authority: " + site.getAuthority());
        System.out.println("Host: " + site.getHost());
        System.out.println("Port: " + site.getPort());
        System.out.println("Path: " + site.getPath());
        System.out.println("Query: " + site.getQuery());
        System.out.println("File: " + site.getFile());
        System.out.println("Ref: " + site.getRef());

    }
}
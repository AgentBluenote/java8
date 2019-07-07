package CECS;

import java.net.*;
import java.io.*;

public class URLDump{
	
    public URLDump(){
    }	

    public static void networkDump() throws MalformedURLException{

        URL aURL = new URL("http://example.com:80/docs/books/tutorial"
                           + "/index.html?name=networking#DOWNLOADING");

        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
    }

    //
    // main()
    //
    public static void main(String[] args) {

        URLDump my_time = new URLDump(); 
        
        try {

             my_time.networkDump();

	} catch (MalformedURLException e) {
	    e.printStackTrace();
	}
     }

}

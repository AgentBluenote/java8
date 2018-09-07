package drivers;

import java.lang.*;
import java.net.HttpURLConnection;
import java.io.*;
import java.util.Calendar;
import java.util.Locale;


//
//  Client/Server program for the 
//
//
public class Pharmacy_ABC {

    // 
    // default Constructor
    // 
	public Pharmacy_ABC(){

		// 
		// we will abstract out foreign strains here.
		// 
	    System.out.println("Pharmacy_ABC");
	}

    //
    //
    //
	public void populate_DB(){ 

	    System.out.println("populate_DB");
	    System.out.println("We like uppers, downers and women!! ");
	}

    //
    //
    //
	public void timing(){ 
    	Locale url = Locale.US; 
    	Calendar timeStamp = Calendar.getInstance();
        
	}

    //
    // main()
    //
	public static void main( String[] args ) {

	    Pharmacy_ABC bigPharma = new Pharmacy_ABC();  

	    bigPharma.populate_DB();
	    bigPharma.serverSide();
	    bigPharma.timing();
	}
	
	//
    public void serverSide(){


//		HttpURLConnection connect = new HttpURLConnection( url );

	    System.out.println("serverSide()");
    }	
}





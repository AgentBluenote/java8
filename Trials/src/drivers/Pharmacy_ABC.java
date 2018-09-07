package drivers;

import java.lang.*;
import java.io.*;

import java.util.Calendar;
import java.util.Locale;

import java.net.HttpURLConnection;

import java.time.LocalDateTime;
import java.util.*;


//
//  Client/Server program for the 
//
//  Time server for US. 
//
//
public class Pharmacy_ABC {
	private Date date     = new Date(); 
	private long the2Poch = 0;  

    // Default Constructor
	public Pharmacy_ABC(){

		// 
		// we will abstract out foreign strains here.
		// 
	    System.out.println("Pharmacy_ABC");
	    
	    the2Poch = date.getTime(); 

	    System.out.println( the2Poch );
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
    //
    //
	public void populate_DB(){ 
	    System.out.println("populate_DB");
	}

    //
    //
    //
	public void timing(){ 
    	Locale url = Locale.US; 
    	Calendar timeStamp = Calendar.getInstance();
        
	}

	//
    public void serverSide(){


//		HttpURLConnection connect = new HttpURLConnection( url );

	    System.out.println("serverSide()");
    }	
}





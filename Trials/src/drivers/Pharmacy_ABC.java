package drivers;

import java.lang.*;  
import java.io.*;

public class Pharmacy_ABC {


	public Pharmacy_ABC(){

		// 
		// we will abstract out foreign strains here.
		// 
	    System.out.println("Pharmacy_ABC");
	}

	public void populate_DB(){ 
		// 
		// we will abstract out foreign strains here.
		// 
	    System.out.println("Pharmacy_ABC");
	}

	public static void main( String[] args ) {

	    Pharmacy_ABC bigPharma = new Pharmacy_ABC();  

	    bigPharma.populate_DB();
	}
	
    public void serverSide(){
    	
    //	String = url 
    //	HttpURLConnection connect = new HttpURLConnection(url);
    	
    }	
}

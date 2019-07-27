//package dictionary;
package cecs;  


import java.lang.StringBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//  making a bible dictionary application that will help me learn the bible better.


public class BibleCompanion {

	// 
	// Construptor 
	// 
	public BibleCompanion() {
        System.out.println("Method == BibleCompanion()" );

        System.out.println("ROOTDIR is C:\\Users\\Michael\\devEnv\\ \n"
        		+ "devAppSpace\\DBFlatFiles\\bibleVerse");
	}

	// 
	// Construptor 2 
	// 
    public BibleCompanion( String flatFile ) {

        BufferedReader inputStream = null;
	    PrintWriter outputStream   = null;
	    String buffer = new String();

        System.out.println("Method == BibleCompanion( String flatFile" );
        
        

	    try{
	    	// 
	    	// input file
	    	// 
            inputStream = new BufferedReader(
            		new FileReader( "C:\\Users\\Michael\\devEnv\\devAppSpace\\"
                                  + "DBFlatFiles\\bibleVerses.txt"));

            outputStream = new PrintWriter(
            		new FileWriter("C:\\Users\\Michael\\devEnv\\devAppSpace\\"
                                  + "DBFlatFiles\\characterOutput.txt"));
            inputStream.readLine();
	        while ((buffer = inputStream.readLine()) != null) {

	            System.out.println("this uses JPA" + buffer);
	            System.out.println("C:\\Users\\Michael\\devEnv\\devAppSpace\\DBFlatFiles");

	            outputStream.println("Delimiter::");
	            outputStream.println(inputStream);
	        }
        } 
        catch(Exception e){
	   	    e.printStackTrace();
	    }
        finally{
            System.out.println("Inside finally Block");

            if (inputStream != null) {
 // 	            inputStream.close();
  	        }

  	        if (outputStream != null) {
  	            outputStream.close();
  	        }
  	    }
    }

	//
	// main 
	//
	public static void main(String[] args) {

		BibleCompanion bibleStuff = null;

        String flat_file = new String("flat_file");

		bibleStuff = new BibleCompanion(flat_file);
	}
}



package CECSold;

//package dictionary;


import java.lang.StringBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//  making a bible dictionary application that will help me learn the bible better.


public class BibleCompanion {

	// 
	// Constructor 
	// 
	public BibleCompanion() {

        System.out.println(" Constructor == BibleCompanion()" );
	}

	// 
	// Construptor 2 
	// 
    public BibleCompanion( String flatFile ) {

        BufferedReader inputStream   = null;
	    PrintWriter    outputStream  = null;
	    String sourceFile = null; 
	    String outFile    = null; 
	    String buffer     = new String();


	    sourceFile = new String( "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
	                                      "\\SnapshotsNeroLocal\\devEnv\\" +
	    		                          "devAppSpace\\DBFlatFiles\\bibleVerses.txt");

	    outFile = new String(
	    		"C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
	              "\\SnapshotsNeroLocal\\devEnv\\" +
   				  "devAppSpace\\DBFlatFiles\\characterOutput.txt" ); 
        
	    try{
	    	// 
	    	// input file
	    	// 
            inputStream = new BufferedReader( new FileReader( sourceFile ));

	    	// kkk
	    	// output file
	    	// 
            outputStream = new PrintWriter( new FileWriter( outFile ));
            
            inputStream.readLine();
	        while ((buffer = inputStream.readLine()) != null) {

	            System.out.println("this uses JPA " + buffer);

	            outputStream.println("Delimiter::");

	            outputStream.println(buffer);

	        }
        } 
        catch(Exception e){
	   	    e.printStackTrace();
	    }
	    /*
        finally{
            System.out.println("Inside finally Block");

            if (inputStream != null) {
 // 	            inputStream.close();
  	        }

  	        if (outputStream != null) {
  	            outputStream.close();
  	        }
  	    } */
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



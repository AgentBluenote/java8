package application;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileProcessing {
	   private String         m_inFilePath    = null; 
	   private String         m_outFilePath   = null; 

	   private BufferedReader m_inputStream   = null;
       private PrintWriter    m_outputStream  = null;

       private ArrayList<String> m_bufferedLines = null; 

		// 
		//  name :    FileProcessing()
		// 
		public FileProcessing() {

	        System.out.println( "FileProcessing()" );
		} 


		public void  systemCall() {
			Process run = null;

	        try {
				run = Runtime.getRuntime().exec("ls");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}


		// 
		//  name :    
		// 
        public void setInFilePath( String inFile ) {
             m_inFilePath = new String( inFile );
             System.out.println(m_inFilePath); 
        }

		// 
		//  name :    
		// 
        public void setOutFilePath( String outFile ) {
             m_outFilePath = new String( outFile );
        }


		// 
		//  method signature : 
		// 
        public ArrayList parseLines() {
        	int index     = 0;
		    String buffer = new String();

        	m_bufferedLines = new ArrayList<String>();
	        
		    try{
		    	// 
		    	// input file
		    	// 
		    	System.out.println( m_inFilePath );

	            m_inputStream = new BufferedReader( new FileReader( m_inFilePath ));
	            m_inputStream.readLine();

		        while ((buffer = m_inputStream.readLine()) != null) {
		        	m_bufferedLines.add(buffer);  
		        	index++;

//		            System.out.println("DEBUG: line[" + index + "]"  + buffer);
		        }
	        } 
	        catch(Exception e){
		   	    e.printStackTrace();
		    }

		    return m_bufferedLines;
	    }

		// 
		//  method signature : 
		// 
        public ArrayList parseLinesAlphabetic(){
			java.util.Collections.sort( m_bufferedLines );
			for(String i : m_bufferedLines ) {
				   System.out.println("where is my C++ book?" + i);
			}
			return m_bufferedLines;
	    }

	    // 
	    // logic to write to a file 
	    // 
	    public void postLines(){

	    	 try{
	             FileWriter filewriter =  new FileWriter( m_outFilePath );
	 	    	 // 
	 	    	 // output file
	 	    	 // 
	             m_outputStream = new PrintWriter( new FileWriter( m_outFilePath ) );
	             
	             m_outputStream.println("hello");
	         } 
	         catch(Exception e){
	 	   	    e.printStackTrace();
	 	    }
	    }

        //
		// utility function.  
        //
	    private void PrintLines( ArrayList<String> input){
			int j =0;
			// 
			// just a check
			// 
			j=input.size();
			for(int index = 0; index< j ; index++ ){
		      System.out.println("line[" + index + "] is: " + input.get(index) );
			}
	    }

		//////////////////////////////////////////////////////////////////////////////////////////
        //
		// main()  Driver  
        //
		//////////////////////////////////////////////////////////////////////////////////////////
		public static void main(String[] args) {

			FileProcessing filePro = null;

//		    String         infile  = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
//		                                   "\\devAppSpace\\DBFlatFiles\\bibleVerses.txt";

//		    String         infile  = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
//		                                   "\\devAppSpace\\DBFlatFiles\\List_of_Companies.txt"; 

//		    String         outfile = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
//		                                   "\\devAppSpace\\DBFlatFiles\\characterOutput.txt";

		    String         hitlist = "/home/michael/Project/devAppSpace/DBFlatFiles/List_of_Companies.txt";
		    String         outfile = "/home/michael/Project/devAppSpace/DBFlatFiles/characterOutput.txt";

		    try {

				Runtime.getRuntime().exec("pwd");

			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}


        	ArrayList<String> lines = new ArrayList<String>();

			filePro = new FileProcessing( );

			filePro.setInFilePath( hitlist );
			filePro.setOutFilePath(outfile);

			lines = filePro.parseLines();

			lines = filePro.parseLinesAlphabetic();

//		    filePro.PrintLines(lines);	

		}
}
    
    // parse XML file
    // ArrayList returnAlphabetical( 


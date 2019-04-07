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

		// 
		//  name :    FileProcessing()
		// 
		public FileProcessing() {

	        System.out.println( "FileProcessing()" );
		} 

		// 
		//  name :    
		// 
        public void setInFilePath( String inFile ) {
             m_inFilePath = new String( inFile );
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
        public ArrayList peelLines() {

        	int index = 0;
        	ArrayList< String > retValue = new ArrayList< String >();

		    String buffer = new String();
	        
		    try{
		    	// 
		    	// input file
		    	// 
	            m_inputStream = new BufferedReader( new FileReader( m_inFilePath ));
	            m_inputStream.readLine();

		        while ((buffer = m_inputStream.readLine()) != null) {
		        	retValue.add(buffer);  
		        	index++;

//		            System.out.println("line[" + index + "]"  + buffer);
		        }
	        } 
	        catch(Exception e){
		   	    e.printStackTrace();
		    }

		    return retValue;
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
		    String         infile  = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
		                                   "\\devAppSpace\\DBFlatFiles\\bibleVerses.txt";

		    String         outfile = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
		                                   "\\devAppSpace\\DBFlatFiles\\characterOutput.txt";


        	ArrayList< String > lines = new ArrayList< String >();

			filePro = new FileProcessing( );
			filePro.setInFilePath(infile);
			filePro.setOutFilePath(outfile);

			lines = filePro.peelLines();

		    filePro.PrintLines(lines);	

		}
}

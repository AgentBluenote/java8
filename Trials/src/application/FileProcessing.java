package application;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

    public class FileProcessing {
	   private String         m_sourceFile   = null; 
	   private BufferedReader m_inputStream  = null;

		// 
		//  method signature : FileProcessing( String flatFile )
		//  type             : Contructor 
		//  scope            : public  
		// 
		public FileProcessing() {
	        System.out.println(" Constructor == FileProcessing()" );
		}

		// 
		//  method signature : FileProcessing( String flatFile )
		//  type             : Contructor 
		//  scope            : public  
		// 
	    public FileProcessing( String flatFile ) {

	        System.out.println(" Constructor == FileProcessing( Sring flatFile )" );

	    	m_sourceFile = flatFile;

        } // end of Constructor


		// 
		//  method signature : processInputFile( String sourceFile ) 
		//  type             : method // MIKE 
		//  scope            : public
		// 
        public void processInputFile( String sourceFile ) {
		    int lineCount = 0;
		    String buffer = new String();
	        
		    try{
		    	// 
		    	// input file
		    	// 
	            m_inputStream = new BufferedReader( new FileReader( sourceFile ));
	            m_inputStream.readLine();
	        
	            do{
		            System.out.println("line[" + lineCount + "]" + buffer);
                    lineCount++;
	            } while ( (buffer = m_inputStream.readLine() ) != null);

	        } 
	        catch(Exception e){
		   	    e.printStackTrace();
		    }
	    }

		// 
		//  method signature : processInputFile( String sourceFile ) 
		//  type             : method // MIKE 
		//  scope            : public
		// 
        public ArrayList peelLines( String sourceFile ) {

        	ArrayList<StringBuffer> retValue = new ArrayList<StringBuffer>();

		    String buffer = new String();
	        
		    try{
		    	// 
		    	// input file
		    	// 
	            m_inputStream = new BufferedReader( new FileReader( sourceFile ));
	            m_inputStream.readLine();

		        while ((buffer = m_inputStream.readLine()) != null) {

		            System.out.println("line[1]" + buffer);
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
	    public static void postLines( String inFile ) {

	    	PrintWriter    outputStream  = null;
	    	
	    	String outFile = new String("C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
		                                   "\\devAppSpace\\DBFlatFiles\\characterOutput.txt");
	    	
	    	
	    	 try{
	 	    	// 
	 	    	// output file
	 	    	// 
	             outputStream = new PrintWriter( new FileWriter( outFile ));
	             
	 //	        while ((buffer = inputStream.readLine()) != null) {
	// 	            System.out.println("this uses JPA " + buffer);

	 	            outputStream.println("Delimiter::");

//	 	            outputStream.println(buffer);
	 	        //}
	         } 
	         catch(Exception e){
	 	   	    e.printStackTrace();
	 	    }

	    }

		//
		// main()  Driver  
		//
		public static void main(String[] args) {

			FileProcessing filePro = null;
		    String         test = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
		                                   "\\devAppSpace\\DBFlatFiles\\bibleVerses.txt";

		    String         test2 = "C:\\Users\\IHATEALL\\Downloads\\Mychael" + 
		                                   "\\devAppSpace\\DBFlatFiles\\characterOutput.txt";

			filePro = new FileProcessing(test2);

			filePro.processInputFile(test2);
			filePro.postLines(test2);
		}
		
		/* MIKE AI: Volvo T6 */
}

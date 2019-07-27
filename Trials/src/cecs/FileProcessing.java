package cecs;

import java.util.*;
import java.io.*;


//
//
//
public class FileProcessing {

   private String         m_inFilePath    = null; 
   private String         m_outFilePath   = null; 

   private BufferedReader m_inStream   = null;

   private PrintWriter    m_outStream   =  null;
   private File           m_file            = null;

    // 
    //  Construcor I 
    // 
    public FileProcessing() {
        System.out.println( "FileProcessing()" );
    } 

    // 
    //  method name: 
    // 
    public void setInFilePath( String inFile ) {
        System.out.println("Inside setInFilePath(inFile)" + inFile ); 

        m_inFilePath = new String( inFile );
        m_file = new File( m_inFilePath );
    }

    // 
    //  method name: 
    // 
    public void setOutFilePath( String filename ) {

        System.out.println( "Inside setOutFilePath " + m_outFilePath ); 

        m_outFilePath = new String(filename); 
    	m_file        = new File( m_outFilePath  );
    }

    // 
    //  method signature : 
    // 
    public ArrayList<String> parseLines() {

        int               index         = 0;

        String            buffer        = new String();
        ArrayList<String> bufferedLines = new ArrayList<String>();

        try{
            // 
      	    // input file
     	    // 
            System.out.println("parseLines " +  m_inFilePath );

  	        // MIKE
            m_inStream = new BufferedReader( new FileReader( m_inFilePath ));

            m_inStream.readLine();

            while ((buffer = m_inStream.readLine()) != null) {
      	        bufferedLines.add(buffer);  
		       	index++;

                System.out.println("DEBUG: line[" + index + "]"  + buffer);
	        }
	    } 
	    catch(Exception e){
	        e.printStackTrace();
        }

        return bufferedLines;
    }

    // 
    //  method signature : 
    // 
    public void write_to_file( ArrayList<String> i_handle ){
//	    java.util.Collections.sort( bufferedLines );  MIKE

        try {
            m_outStream  = new PrintWriter( m_outFilePath );
	    m_outStream  = new PrintWriter( m_outFilePath );

    	    // 
    	    // for each loop HOMIE 
    	    // 
	        for(String i : i_handle ) {
	            System.out.println( "where is my C++ book?" + i );

	    	    m_outStream.println(i);

//			    m_outStream.write(i_handle)); MIKE maybe printf style formatting. 
	        }
		} catch (FileNotFoundException e) {
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

    //
    // method name:
    //
    public void NIO_write_to_NVRAM( String fqf ) {
    	
    System.out.println( "this is a debug: " + fqf );	
    	
    	
        try {

            String content = "Thisthis is the2 content to write into file";

//            File file = new  File("C:/Users/Geroge/SkyDrive/Documents/inputFile.txt");

//            File file = new  File( fqf );

            // if file doesnt exists, then create it
            if (!m_file.exists()) {
                m_file.createNewFile();
            }

            FileWriter fw = new FileWriter( m_file.getAbsoluteFile() );
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    
    
    
    
//////////////////////////////////////////////////////////////////////////////////////////
//
// main()  Driver  
//
//////////////////////////////////////////////////////////////////////////////////////////

//    @SuppressWarnings("unchecked") //  <---  this is a suppresor.  M.A. 
    public static void main(String[] args) {

        ArrayList<String> lines  = new ArrayList<String>();

        String            infile = "/home/michael/testbench/List_of_Companies.mike.test"; 

        String            outfile = "/home/michael/testbench/shortlist.txt";

        FileProcessing    filePro = new FileProcessing( );

        filePro.setInFilePath( infile );
        filePro.setOutFilePath(outfile );

        lines = filePro.parseLines();
///	    System.out.println( "After call to parseLines " + lines.size());

        filePro.NIO_write_to_NVRAM( outfile );

//	    filePro.write_to_file( lines );
	}
//}  // MIKE

    class WriteToFileExample {


    }

}  // end of class 

package CECS;
//package dictionary;

import java.lang.String;
import java.lang.System;         // pull time
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;

import java.util.*;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;

/*  
 *  Purpose     :  to keep track of my money. $$$   
 *  Description :  
 *  
 *  Class AbstractStore  : Base Class from which all others are derived.
 *  Class GroceryStore   : ie. [Cardenas, Albertsons, Krogers            ] 
 *  Class DepartmentStore: ie. [Target, Sears, Macy's, Robinsons May, 
 *                              Gap, Wet Seal, Forever 21                ]  
 *  Class ConveniantStore: ie. [Alta dena, Grab N Go,                    ]  
 *  Class RetailStore    : ie. [Macy's, Kohl's, Robinsons May            ] 
 *  Class WholesaleStore : ie. [Costco, Sam's Club, Price Club           ] 
 *  Class ThriftStore    : ie. [Good Will, Salvation Army                ] 
 *  
 *  Class BookKeeping.
 *  
 *  Make a Bible dictionary application that will help me learn the bible better.
 *
 * @author Annonymous
 *
 */

/**
 * @author Michael
 * @version Michael
 *
 */
public final class MoneyLog{
    private String         m_inputStr  = null;  // full path of in file.
    private String         m_outputStr = null;  // full path of out file.
    private PrintWriter    m_outStream = null;   //  Need object to acces System level resources. 
//    ChristianCalendar              cal = new ChristianCalendar(); 

    //
    // void 
    //
    public MoneyLog(){
		String[] versions = { "1.1", "1.2", "1.3", "1.4"  };
		int [] index;

        System.out.println("MIKE line " + versions[0] + " is:" + versions[0] );
	}
    
    //
    // void 
    //
    public void appLeveltime(){
       Locale local = null; 
       Calendar calendar = null;
    } 

	// 
    //  processCharacterStream(){
    //  
    //  read input file 
	//  write to file with delimiters  
    //
    public void processCharacterStream(){
    	FileReader     fileHandle  = null; 
        BufferedReader inputBuff   = null;  // Need buffer to process text.
    	String str_buffer          = new String();

    	int line_count    = 0;
    	int total_lines   = 0;
    	
        this.parseFileToken( m_inputStr );  // utility function

        try{
        	// open input file 
            // determine platform and path delimeter. 
        	//   set env.drive
        	//   set env.root_directory
        	//   set env.file_name
        	fileHandle = new FileReader( m_inputStr); 

            // read into buffer.
        	inputBuff = new BufferedReader( fileHandle );  // set local buffer.    
        			
        	//
        	// Open ouput Stream 
        	//
            m_outStream = new PrintWriter( 
            		new FileWriter( m_outputStr ) );
                                  
        	// 
        	// read one line of text into buffer  
        	// 
	        while( ( str_buffer = inputBuff.readLine() ) != null ){
	            line_count++;
	            total_lines++;

 //             System.out.println("MIKE line " + line_count + " is:" + str_buffer);
	            m_outStream.println( inputBuff ); // print to file.
	        }
//            System.out.println("lines read: " + total_lines );
        } 
        catch( Exception e ){
            // catch checked exeption
	   	    e.printStackTrace();
	    }
    }

    // 
    // set member attribute. 
    //
    public void setInputStream( String inputPath ){
        m_inputStr = new String( inputPath );
    }

    // 
    // set member attribute. 
    //
    public void setOutputStream( String outputPath  ){
        m_outputStr = new String( outputPath ); 
    }

    // utility method 
    //
    // prints out just the file name of the input string. 
    //
    // MIKE
    //
    private void parseFileToken( String arg1 ) {
    	StringBuffer buff = new StringBuffer(); 

        System.out.println( "Inside parseFileToken( String arg1 )" );
        System.out.println( "arg1" + arg1 );
    	
    	buff.capacity();
    }

    // void 
    // utility method 
    //
    // prints out just the file name of the input string. 
    //
    // print file to console 
    //
    private void printFile( FileReader  p_fileHandle ){
        BufferedReader buffer = null; 

        // read into buffer.
        buffer = new BufferedReader( p_fileHandle );  // set local buffer.    
    }

    // 
    // tiny GUI 
    // 
    public void tinyGUI()  {
    	int   [] index;
        String[] versions = { "1.1", "1.2", "1.3", "1.4"  };

    	JFrame frame          = new JFrame();
    	JPanel canvas         = new JPanel();
    	FlowLayout flowlayout = new FlowLayout();
    	JTextField textField  = new JTextField(50); 

        System.out.println( "Inside tinyGUI()");

        textField.setText( "Answer" );
        textField.setSize(50, 50);
        textField.setPreferredSize( new Dimension(80,80) );

    	canvas.setSize(400, 400); 
    	canvas.setPreferredSize( new Dimension(400,200));
    	canvas.add(textField);

    	frame.add(canvas);
        frame.setLayout( flowlayout );
   	    frame.pack(); 
    	frame.setVisible(true);

        System.out.println( "should not get this far without EU input" );
	}

    //  MIKE SYSTEM 
    //  Calculate all occurances of friday the 13th since 1999 
    // 
    public void getTime(){
        Calendar myCalendar = null;	
        Date the_date = new Date();

        System.out.println( "The Current timme is: " + the_date.getTime() );

    	System.getenv();  // get Platform information.
    	// 1. pull runtime env
    	// 2.  
    	// 3.

    } 

	//
	///////////////////////////////////////////////////////////////////////////
	//   
	//   Driver program. 
	//
	///////////////////////////////////////////////////////////////////////////
    //
	public static void main(String[] args) {

        MoneyLog moneyDB = null;
        //GroceryStore grocery_store = new GroceryStore(); 
/* MIKE
        String fileIn = new String(
        		"C:\\Users\\Michael\\devEnv\\devAppSpace\\"
        		+ "DBFlatFiles\\foodlog.txt" ); 
*/

        String fileIn = new String(
        		"/home/michael/Project/CSULB/mbravo/foodlog.txt" ); 

//        String fileOut = new String(
 //       		"C:\\Users\\Michael\\devEnv\\devAppSpace\\" + 
  //              "DBFlatFiles\\characterOutput.txt");

        String fileOut = new String(
        		"/home/michael/Project/CSULB/mbravo/characterOutput.txt");

        moneyDB = new MoneyLog();

		moneyDB.setInputStream( fileIn );
		moneyDB.setOutputStream( fileOut ); 
		moneyDB.processCharacterStream();

        moneyDB.tinyGUI();
	}

	
//  Object stuff MIKE	

	/*
	public int hashCode(){
	    int objectAddress = 1999;
		return  objectAddress;
	}
	*/

/*  MIKE: TBD
 *	public String toString(){
 *      // this.getClass().getName() + '@' + Integer.toHexString( this.hashCode());
 *      // looks like this:  dictionary.BibleCompanion@7852e922
 *	}
 *
/*
	public boolean equals( Object obj ){
	    boolean George         = false;
        String str             = null; 
	    return George;
	}
	
*/	
}


/*
 * Calculate every occurance of Friday the 13th this Century.  
 *  
 * System time:
 *      1.calculate the number of seconds since my birthday. 
 *      2. convert between military format. 
 *
 *   tax on goods and services.
 *   tax on prepared foods. 
 *    
 *
 */





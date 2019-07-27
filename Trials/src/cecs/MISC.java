package cecs;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

// Utility class
// 
// 
// A = P( 1 + r/n ) nt ( n = number of times interest is compounded per unit of time )
// 
// rate = .0425 annually for 30 years 
// 
// 
public class MISC {
	
	/** Indent level */
    public int indent = 0;

    /** Indentation will be in multiples of basicIndent  */
    public final String basicIndent = "  ";

    //
    //
    //
    public static void TRACE( StringBuilder in_arg ){

    }

    //
    //
    //
    public static void mortgaugePayment( int purchase_price ){
      // interest formula here.
    }

    //
    //
    //
    public static void mnRule( int base, int positions ){
        double result;

        result = Math.pow( base, positions );
	
        System.out.println("BASE: " + base + " POSITIONS: " 
                                           + positions + "\nCombinations: " 
                                           + result );
    }
    
    // 
    // method name: 
    // 
    public static ArrayList<String> issueSystemCall( String command ){  
        ArrayList<String> ret_array = new ArrayList<String>();

//        System.out.println("issueSystemCall(  String command )"); 

        try {
            Process p = Runtime.getRuntime().exec( command );
            p.waitFor();

            BufferedReader reader = new BufferedReader(
            		                    new InputStreamReader( p.getInputStream() ));
            String line = reader.readLine();
            
            ret_array.add ( line );

            while (line != null) {    
//                System.out.println(line);
                line = reader.readLine();

                ret_array.add ( line );
            }
        }
        catch(Exception e ) {
        	e.printStackTrace( );
        }

        System.out.println("finished."); 

        return ret_array;
    }
    
		
    //
    // main()
    //
    public static void main(String[] argv) {
         String filename    = new String( "gangland.xml");
//         String filename    = new String( "employee.xml");

    	 StringBuilder path = new  StringBuilder( System.getenv( "CSULB_XML" ) );

//         System.out.println( "path: " + path.toString() ); 

        //
        // must have fully qualified path and filename.
        //
        if ( argv.length == 0){  
            System.out.println("command line param:argv[0] " + "No input argument" );

        }
        else{ 
            System.out.println("command line param:argv[0] " + argv[0] );
        }

 //      MISC.mnRule(2, 8 );
  //     MISC.issueSystemCall( "uname -a" );
       

       // To send One package:
    }		

}


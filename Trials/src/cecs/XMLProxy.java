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
public class XMLProxy{
	
    private File                   m_xmlFile   = null; 
    private DocumentBuilderFactory m_dbFactory = null; 
    private DocumentBuilder        m_dBuilder  = null; 
    private Document               m_doc       = null; 

    public XMLProxy(){
    }

    //
    // method name:  readXMLfile()
    //
    public ArrayList<Student> readXMLfile( StringBuilder in_path, String in_filename ) {
    	
        ArrayList<Student> student_array  = new ArrayList<Student>();
        Student lucky_student             = new KeptWomenStudent();


        String text_element = new String(); 

        m_xmlFile = new File( in_path.append( in_filename ).toString() );

        System.out.println( m_xmlFile ); 

	     m_dbFactory = DocumentBuilderFactory.newInstance();
	     m_dbFactory.setValidating(true);  // added this for dtd MIKE 
	     m_dbFactory.setNamespaceAware(true);
	     

        try {

	     m_dBuilder  = m_dbFactory.newDocumentBuilder();
	     

	     // add error handling as annonymous inner class  MIKE
	     m_dBuilder.setErrorHandler(new ErrorHandler() {
	    	    @Override
	    	    public void error(SAXParseException exception) throws SAXException {
	    	        // do something more useful in each of these handlers
	    	        exception.printStackTrace();
	    	    }
	    	    @Override
	    	    public void fatalError(SAXParseException exception) throws SAXException {
	    	        exception.printStackTrace();
	    	    }

	    	    @Override
	    	    public void warning(SAXParseException exception) throws SAXException {
	    	        exception.printStackTrace();
	    	    }
	    	} );

	     m_doc = m_dBuilder.parse( m_xmlFile );  // Document
	     
	     m_doc.getDocumentElement().normalize();

	    // In our case is GangEntity
	    System.out.println("Root element :" + m_doc.getDocumentElement().getNodeName());
	    System.out.println("----------------------------");

	    NodeList node_list = m_doc.getElementsByTagName("staff");  // pulls linked-list    
	    
        // 
        // traverse linked list
        // 
	    for (int i = 0; i < node_list.getLength(); i++) {

	        Node next_node = node_list.item(i);  // peel next nodee off the list

	        // 
	        // instantiate new Object.
            lucky_student             = new KeptWomenStudent();

	        System.out.println("\nCurrent Element :" + next_node.getNodeName());

	        if ( next_node.getNodeType() == Node.ELEMENT_NODE ) {
	            Element eElement = (Element) next_node;  // cast interface Node to a concrete class. 

	            System.out.println("Staff id : "
	                               + eElement.getAttribute("id"));
	            
                text_element =  eElement.getElementsByTagName("firstname").item(0).getTextContent();
                  System.out.println( "This is it" + eElement.getTextContent());

               System.out.println("First Name : " + text_element );
                lucky_student = CriminalFactory.getCriminal( text_element );
	            
                // set first name
	            lucky_student.setName( text_element);

//	            text_element = eElement.getElementsByTagName("lastname").item(0).getTextContent();
//MIKE	           System.out.println("Last Name : " + text_element );


	            text_element = eElement.getElementsByTagName("nickname").item(0).getTextContent();
	            System.out.println("Nick Name : " + text_element );
	            
	            // set nick name
	            lucky_student.setNickName( text_element );

	            text_element = eElement.getElementsByTagName("gangaffiliation").item(0).getTextContent();
	            System.out.println("GangAffiliation : " + text_element );
  
	            // set gang affiliation as Social Security number. 
	            lucky_student.setSSNumber(text_element );

	            text_element = eElement.getElementsByTagName("slogan").item(0).getTextContent();
	            System.out.println("slogan : " + text_element );

	            student_array.add( lucky_student );
	        }  // element node MIKE

       }  // end for

       } catch (Exception e) {
              e.printStackTrace();
       }  

       return student_array;  // MIKE change form void

    } // end readXMLFile()
    
    //
    // main()
    //
    public static void main(String[] argv) {
         String filename    = null; 
    	 StringBuilder path = null;
    	 XMLProxy hamas     = null; 

        //
        // must have fully qualified path and filename.
        //
        if ( argv.length == 0){  	
            System.out.println("command line param:argv[0] " + "No input argument" );

        }
        else{ 
            System.out.println("command line param:argv[0] " + argv[0] );
        }


//       filename    = new String( "employee.xml");
         filename    = new String( "gangland.xml");
//    	 path        = new  StringBuilder( System.getenv( "CSULB_XML" ) );
    	 path        = new  StringBuilder( System.getenv( "TEST_BENCH" ) );

         System.out.println( "path: " + path.toString() ); 

         hamas = new XMLProxy();
         hamas.readXMLfile( path, filename);  // MIKE use hash table for return value.

    }
}



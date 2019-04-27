package CECS;




import java.util.*;


public class Application implements OSGIServices{
    private static int m_instanceNumber  = 0;   
	private String     m_name = null;     // ie  Michael A.
	private String     m_homeDir = null;  // ~marcham
	private String     m_license= null;   //  Apache 2.0 "the License" 
	
	private Student author = new Student();

	// 
	// default Constructor
	// 
    public Application() {
    }

	// 
	// default Constructor
	// 
    public Application( String [] array_arg ){ 
    	m_name    = array_arg[0]; 
    	m_homeDir = array_arg[1];
    	m_license = array_arg[2];
    }

	// 
	// default Constructor
	// 
    public Application( String arg_name , String arg_homeDir , String arg_license ){
    	m_name    = arg_name; 
    	m_homeDir = arg_homeDir;
    	m_license = arg_license;
    }
    
    //
    // do a check here to make sure that all the expected libraries are
    // at the right location ( at the right time ) in the expected
    // format ( ie.  .h .o .a .so .jar .war ) 
    //  
    // timeing will matter with dynamic typing but we will implement the  
    // the scheduler first. 
    // 
    //  
    public void compileAndLink( /*File input */ ){
    	
    }  
         
    
    
    

    //************************************************************* 
    // interface stuff
    // MIKE
    //************************************************************* 
    public void get_Name(){
        System.out.println("Alumni Name: " + m_name );
    }

    public void get_HomeDirectory(){
        System.out.println("Home Directory: " + m_homeDir );
    }
    
    public void getLibrary(Student cecs_student ){
    	
    } 
    public void getExportFormat(Student cecs_student ){
    	
    } 
    public void getPortNumber(Student cecs_student ){
    	
    } 

    public void getSOA(Student cecs_student ){
    	
    } 

// MIKE 4 later.
//    public void get_Application_format(){
    	// .exe .war .ear 
    	// .dll
 //   }
//        System.out.println("T. Nguyen");
 //       System.out.println("tnguyen@cecs.csulb.edu");

  	//   
  	//   
  	//   
    public void licenseAgreement(){
        System.out.println( "License: " + m_license  );
    }

}

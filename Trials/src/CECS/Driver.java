package CECS;

import java.util.*;

public final class Driver {

//    private static Student m_criminal  =  new UnknownStudent();  

    // 
    // default Constructor
    // 
    public Driver(){
    }

    //
    // main()
    //
    public static void main(String[] args) {

       BotNet     robot               = new BotNet(); 
       XMLProxy   xml_proxy           = new XMLProxy();
       Student    base_class          = new Student();

       ArrayList cecs175      = new ArrayList();
       int       cecs175size  = cecs175.size(); 

       // CSULB_XML is environment variable
//       StringBuilder path     = new StringBuilder( System.getenv("CSULB_XML")  );
       StringBuilder path     = new StringBuilder( System.getenv("TEST_BENCH")  );
       System.out.println("path " + System.getenv("TEST_BENCH") );
       String        filename = new String( "gangland.xml" );


       System.out.println("cecs175 size(): " + cecs175size  );

       System.out.println("***************** VOID VOID ****************\n"); 
       System.out.println("***************** VOID VOID ****************\n"); 

       System.out.println("TESTCASE 1:*\n"); 
       System.out.println("TESTCASE 2:*\n"); 
       System.out.println("TESTCASE 3:*\n"); 
       System.out.println("TESTCASE 4:*\n"); 
       System.out.println("TESTCASE 5:*\n"); 

       System.out.println("Michael's Gang of \"Soft Skin\" Crypts!:\n\n"); 


       // this xml has 3 cardenas ladies 
       cecs175 = xml_proxy.readXMLfile( path, filename );  


       for( int i=0; i< cecs175size ; i++ ){

    	   base_class = new Student();
           base_class = (Student) cecs175.get( i );

           System.out.println("Michael's Gang of \"Soft Skin\" Crypts!:\n\n"  );


           System.out.println(""
                     + "Name            : " +  base_class.getName() 
                     + "\nSS Number        : " +  base_class.getSSNumber()

                     + "\nHomeDirectory         : " +  base_class.getHomeDirectory()
                     + "\nLicense Agreement : " + base_class.getLicenseAgreement() + "\n" );

           System.out.println("I am :" + base_class.getSSNumber() );

       }

    } // main()
}


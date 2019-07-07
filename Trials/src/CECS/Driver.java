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

//       BotNet  robot               = new BotNet(); 

//       Student registered_student    = new UnknownStudent();
//       Student unregistered_student  = new UnknownStudent();
       XMLProxy mike = new XMLProxy();

       // nt has to do with security.
       Student base_class = new Student();

       ArrayList<String>  mylist  = new ArrayList<String>();
       ArrayList          cecs175 = new ArrayList();
       int cecs175size            = 0;
       // 
       // kept women file
       // path of xml file with 2 records. 
       StringBuilder path = new StringBuilder( System.getenv("CSULB_XML")  );
       String    filename = new String( "gangland.xml" );

       
       // this xml has 3 cardenas ladies 
//       cecs175 = MISC.readXMLfile( path, filename );  
       cecs175 = mike.readXMLfile( path, filename );  

      cecs175size  = cecs175.size(); 

       System.out.println("cecs175 size(): " + cecs175size  );


       // Both are Criminals
//       registered_student    = CriminalFactory.getCriminal("Volper");

//       unregistered_student  = CriminalFactory.getCriminal("Mariana");
 
//       System.out.println ("this getlicenseAgreement()" +  
 //                          unregistered_student.getLicenseAgreement() ); 
 

       System.out.println("***************** VOID VOID ****************\n"); 
       System.out.println("Michael's Gang of \"Soft Skin\" Crypts!:\n\n"); 

       for( int i=0; i< cecs175size ; i++ ){
    	   base_class = new Student();

           base_class         = (Student) cecs175.get( i );

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


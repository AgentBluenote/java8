package cecs;

import java.util.*;
import java.lang.*;

// 
//    Scechdule of classes
//       Full time - Recieves fulltime financial aid.  ( 12+ Units ) 
//       Full time - Recieves part-time finacial aid.  ( 6 
//    Stafford loans with be dispersed at my discretion. 
//      *Note: this applies for both subsidised and unsubsidised loans. 
//
//    Declation of Major -
//    Certified Major Requirments  - Must speak with Department Councelor. 
//      *Note: this prevents what?
//      
//    Conformed Copy - A conformed copy basically states. You will do as your 
//                       told `or` die. 
//
public class KeptWomenStudent extends Student{ 

    private String kept_chipset_path = new String("marcham/ mramirez: "); 
    private String kept_job_description   = new String("marcham/ mramirez: "); 

    // we use C++/Gesture API to pass messages. 
    private String kept_KI54_Gesture   = new String("marcham/ mramirez: "); 


    //
    // Constructor
    //
    public KeptWomenStudent() {

    }

    //
    // method name:   This will be a message queue
    //
    public String readMessage(){
        return "[source: Message Queue]: Blow me a kiss"; 	
    }
    
    //*********************************************************************** 
    //
    // Interface methods...  for setting Class Attributes/Properties 
   //                                              ( A.K.A Proper-T's 
    //                                             Iced-T's Cousin Royal-T's Brother.  
    //
    //*********************************************************************** 

    // 
    // method name: 
    // 
    public String getName(){
    	String ret = new String();

        ret = super.getName();
        return ret;
    }

    // 
    // method name: 
    // 
    public void setName( String name ){
        super.setName( name );
    }


    //
    // method name:   
    //
    public String getSSNumber(){
    	String ret = new String();

        ret = super.getSSNumber();
        return ret; 
    }

    //
    // method name: 
    //
    public void setSSNumber(String ss_number) {
        super.setSSNumber( ss_number );
    }
    
    // 
    // method name: 
    // 
    public String getHomeDirectory(){
    	String ret = new String();     

        // This is because Java is "call by Reference"
    	ret = super.getHomeDirectory();

        return ret; 
    }

    //
    // method name: 
    //
    public String getLicenseAgreement(){
        return "I use Apache 2.0 the Liecense";
    } 
    
    //************************************************************* 
    //
    //  main()
    //
    //************************************************************* 
    public static void main(String[] args) {

        Student default_student         = new Student();
        Student female_student         = new KeptWomenStudent();

        female_student.setName("Veronica");
        female_student.getName();
        female_student.setSSNumber("548-xx-xxxx");
        female_student.getSSNumber();
        

        default_student.setName("Michael \"Sicko\" Hurley");
        default_student.getName();
        default_student.setSSNumber("(714)557-5807"); // VoIP land line. 
        default_student.getSSNumber();
    }
}

/*

        System.out.println( "Citizen as defined by: Merriam-Webster.\n" +
                            "One entitled to the rights and privileges of a freeman.\n"); 
        
        System.out.println( "a native or naturalized person who owes allegiance\n" + 
        		            "to a government and is entitled to protection from it.\n\n" );

        System.out.println( "She was not an American citizen but is a \"Kept-Woman\" \n " +
        		            "and is Loyal to her benefactor.\n" );
        		            */

/*
        System.out.println( 
        "2. a civilian as distinguished from a specialized servant of the state." +
        "ie: Soldiers were sent to protect the citizens." );
*/

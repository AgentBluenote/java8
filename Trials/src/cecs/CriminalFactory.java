package cecs;

import java.util.*;

/*
 *  A platform is a combination of different components. 
 *  i.e.  SnapDragon Chipset 
 *        Android OS 
 *        HotSpot JVM  
 *        HTML5 
 *        
 *  i.e.  Sony DS Chipset  ( "DS stands for "Deep Shit" )
 *        Windows embedded ( Speed Kernal ) 
 *       .Net ( Run-Time ) 
 *        HTML5 
 *        
 *        
 *       JSR 1 JMS Java Message Service 	 
 *       JSR 154 JMS Java Message Service 	 
 *       JSR 907 JTA Java Transaction API  
 *       JSR 356 Java API for WebSocket 
 *       JSR 914 JMS Java Message Service 	 
 *        
 *       *every week and every paycheck for the amplification model. 
 *        
 */
public final class CriminalFactory {

    // 
    // default Constructor
    // 
    public CriminalFactory(){
    }

    // 
    // method name:
    // 
    // Pattern Type: Factory, which is a creational Pattern 
    //               which is always backed by "Detroit Muscle"
    //
    // T is for Tenure, means they can not lose their job 
    // 
    // Tenure is so rewarding as you do not have to constantly streSS
    // about losing your job, losing your lively-hood 
    //
    // As you NO, if it's a pattern, I can program it.  - annonymous
    // 
    public static Student getCriminal( String subtype ){

        Student m_criminal  =  null; 

    	switch ( subtype ){   // we know the name of the student

    	    case "Volper":
               System.out.println("Criminal Name:  Dennis Volper" );

               m_criminal  =  new KeptWomenStudent();
               m_criminal.setName( "Dr. Volper" );

   	           break;

    	    case "Mariana":
               System.out.println("Criminal Name:  Miss M. Ariana" );
               m_criminal  =  new KeptWomenStudent();
               m_criminal.setName( "Mariana" );  


    	    case "Veronica":
               System.out.println("Criminal Name:  Veronica Navarro");

               m_criminal  =  new KeptWomenStudent();
               m_criminal.setName("Veronica");

    	        break;

    	    default:
                System.out.println("default case: " );

    	} // end switch

        return m_criminal;
    }

    //
    // main()
    //
    public static void main(String[] args) {


    }
}


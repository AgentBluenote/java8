package cecs;

import java.lang.Runtime;
import java.time.Clock;
import java.time.LocalDateTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;
import java.time.*;

//
//  Client/Server program for the 
//
//  JSR 1  Latency for "Hard" Real-Time Requirements  
//
//  Reverse Calendar 
//    1.  Calculate the days I got paid.
//          ( Payday was every other Thurday )
//    2.  We will continue on that schedule for my suplimental income.  
//      a. same account ( personnal ),  same name! 
//        
//        
public class TimeServer{
	
    private Date m_date     = new Date(); 
    private long m_the2Poch = m_date.getTime(); 

    private Calendar m_GregorianCalendar = new GregorianCalendar();

    // 
    // Defualt Constructor 
    // 
    public TimeServer(){
        System.out.println("TimeServer::TimeServer()");
    }

    // 
    // Constructor: II
    // 
    public TimeServer( boolean server ){

        System.out.println( "TimeServer::TimeServer( boolean server)"); 

        if( server == true ){

            while( true ){

                // 
                // try block for Tread.sleep
                // 
                try {
      	            this.getTimeStamp();

                    Thread.sleep(1000);  // this is a Handled exception 

                } catch (InterruptedException e){
                    // What do we do here for *this exception? 
                    e.printStackTrace();
                }
            } // end of while
        }	
    }

    //
    // method name:
    //
    public Calendar getTimeStamp(){

        Calendar ret_value = new GregorianCalendar();

        // begin output
        System.out.println("Current Time\n\n" );
        System.out.println( "Mike was here..");
        System.out.println( "Hello world; the time is now: " );

        // 
        // MIKE: fix this: create a GregorianCalendar with the Pacific Daylight time zone
        // and the current date and time
        // 

        // print out a bunch of interesting things
        System.out.println("YEAR: " + m_GregorianCalendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + m_GregorianCalendar.get(Calendar.MONTH));
        System.out.println("DATE: " + m_GregorianCalendar.get(Calendar.DATE));
        System.out.println("DAY_OF_MONTH: " + m_GregorianCalendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("AM_PM: " + m_GregorianCalendar.get(Calendar.AM_PM));
        System.out.println("HOUR: " + m_GregorianCalendar.get(Calendar.HOUR));
        System.out.println("MINUTE: " + m_GregorianCalendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + m_GregorianCalendar.get(Calendar.SECOND));
        System.out.println("MILLISECOND: " + m_GregorianCalendar.get(Calendar.MILLISECOND));

        System.out.println("MILLISECOND: " + m_GregorianCalendar.get(Calendar.MILLISECOND));
        return ret_value;
    }
	
    //
    //  Use GregorianCalendar class to figure out all the dates 
    //  for payday for "exempt" employees which was 
    //  every other Thursday. 
    //
    public void reversePayChex( Object bank ) {

    }
	
    //
    // main()
    //
    public static void main( String[] args ) {

        TimeServer timeInstance     = null; 
        boolean    serverFlag       = false ;  

        timeInstance = new TimeServer( serverFlag );  

        timeInstance.getTimeStamp();

        timeInstance.getTime();

    }

    //
    //  method name:
    //
    public void getTime(){ 
    	
        long millisecs = 0;

    	Clock the_clock = Clock.systemUTC(); 
    	the_clock = the_clock.systemUTC();
    	millisecs = the_clock.millis();

//    	System.out.println( the_clock.systemUTC()  );
    	System.out.println( millisecs  );

    	
    }

} // end of class

 

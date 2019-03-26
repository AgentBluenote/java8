package application;

import java.lang.Runtime;
import java.time.LocalDateTime;


//import java.util.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;
import java.net.HttpURLConnection;

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
//        
public class TimeServer {
	
	private Date date     = new Date(); 
	private long the2Poch = 0;  


    //
    // main()
    //
	public static void main( String[] args ) {

	    TimeServer timeInstance = null; 
	    Class<?>   clazz        = null;
	    Runtime    runtime      = null; 
	    boolean serverFlag = false ;  


	    timeInstance = new TimeServer( serverFlag );  

	    runtime      = Runtime.getRuntime(); 

	    clazz = runtime.getClass();
	    

//	    System.out.println( clazz.getCanonicalName());

	    timeInstance.timing();
	    timeInstance.printCalendarInfo();
	    Locale locale = Locale.getDefault();

	    System.out.println( locale.getLanguage());
	}


	// 
	// Defualt Constructor 
	// 
	public TimeServer(){
	    System.out.println("TimeServer( client )");
	}
	
	
    // 
    // Constructor
    // 
	public TimeServer( boolean server ){

	    System.out.println("Inside TimeServer...");

 	    if( server == true ){

            date = new Date(); 
 	        while( true ){

	            try {

        	        the2Poch = date.getTime(); 
	                System.out.println( "hello world; the time is now: " + the2Poch );
	                System.out.println( the2Poch );

					Thread.sleep(1000);  // this is a Handled exception 

				} catch (InterruptedException e) {
					// What do we do here for *this exception? 
					e.printStackTrace();
				}
	        } // end of while
	    }	
	}

    //
    //  Use GregorianCalendar class to figure out all the dates 
	//  for payday for "exempt" employees which was 
	//  every other Thursday. 
    //
	public void printCalendarInfo(){ 
//	    System.out.println("MIke was here..");
	    // 
	    // get the supported ids for GMT-08:00 (Pacific Standard Time)
	    // 
	    String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);

	    System.out.println("MIke was here.." + "ids.length = " + ids.length);

	    // 
	    // if no ids were returned, something is wrong. get out.
	    // 
	    if (ids.length == 0)
	        System.exit(0);

	     // begin output
	    System.out.println("Current Time\n\n" );

	    // create a Pacific Standard Time time zone
	    SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

	    // set up rules for Daylight Saving Time
//	    pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
//	    pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

	    // 
	    // create a GregorianCalendar with the Pacific Daylight time zone
	    // and the current date and time
	    // 
	    Calendar calendar = new GregorianCalendar(pdt);
	    Date trialTime = new Date();
	    calendar.setTime(trialTime);

	    // print out a bunch of interesting things
//	    System.out.println("ERA: " + calendar.get(Calendar.ERA));
	    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
	    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
//	    System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
//	    System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
//	    System.out.println("DATE: " + calendar.get(Calendar.DATE));
//	    System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
//	    System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
//	    System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
	    System.out.println("DAY_OF_WEEK_IN_MONTH: "
	                       + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
	    System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
	    System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
	    System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
	    System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
	    System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));

	    System.out.println("ZONE_OFFSET: "
	                       + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
	    System.out.println("DST_OFFSET: "
	                       + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));

	    System.out.println("Current Time, with hour reset to 3");

//	    calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
//	    calendar.set(Calendar.HOUR, 3);

	}

	@SuppressWarnings("deprecation")
	public void ourCalendar(){ 
    	Locale   url = Locale.US; 
    	Calendar calendar  = Calendar.getInstance();
    	
	    System.out.println( date.toGMTString() );

	}

    //
	// timing(){ 
    //
	public void timing(){ 
	    System.out.println("Inside timing()");
	}

	//
	// serverSide()
	//
    public void serverSide(){
//		HttpURLConnection connect = new HttpURLConnection( url );
	    System.out.println("serverSide()");
    }	
}


// MIKE errata


	// milestones dates
	//  03-01-2010 Part A
	//  11-01-2010 Part B
	//  03-01-2010 Part C   // includes Travel, curtesy of Pan AM 103 at 10%. 
	//  03-01-2010 Part D   // slice(R..X)  --> {R,S,T,U,V,W,} [Y,Z  // look AT() documentation for slice();
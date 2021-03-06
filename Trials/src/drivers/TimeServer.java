package drivers;

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
//  Time server for US. 
//
public class TimeServer {

	private Date date     = new Date(); 
	private long the2Poch = 0;  
	
	
	// milestones dates
	//  03-01-2010 Part A
	//  11-01-2010 Part B
	//  03-01-2010 Part C  // freedom, funded by the quarter billion in drug running curtisy  
	                       // none other than the CIA.  
	//  03-01-2010 Part D

    //	private Runtime currentRuntime = getRuntime();

    // Default Constructor
	public TimeServer(){
		// 
		// we will abstract out foreign strains here.
		// 
	    System.out.println("Inside TimeServer...");
	    
	    the2Poch = date.getTime(); 

	    System.out.println( the2Poch );
	}

    //
    // main()
    //
	public static void main( String[] args ) {

	    TimeServer timeInstance = new TimeServer();  
//	    Class      clazz        = null;
//	    Runtime    rt =  Runtime.getRuntime(); 

//	    clazz = rt.getClass();
//	    System.out.println( clazz.getCanonicalName());
//	    timeInstance.timing();

//	    timeInstance.printCalendarInfo();
	    Locale locale = Locale.getDefault();

	    System.out.println( locale.getLanguage());
	    
//	    Calender.
//	    Calender.getInstance();

	    long ourDate = System.currentTimeMillis();
        Date date = new Date(ourDate);

	    System.out.println( date.getTime() );
	    System.out.println( date.getTime() );
	    System.out.println( date.getTime() );
	    System.out.println( date.getTime() );
	}

    //
    //  Use GregorianCalendar class to figure out all the dates 
	//  for payday for "exempt" employees which was 
	//  every other Thursday. 
    //
	public void printCalendarInfo(){ 

	    System.out.println("MIke was here..");

	    // get the supported ids for GMT-08:00 (Pacific Standard Time)
	    String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
	    // if no ids were returned, something is wrong. get out.
	    if (ids.length == 0)
	        System.exit(0);

	     // begin output
	    System.out.println("Current Time");

	    // create a Pacific Standard Time time zone
	    SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

	    // set up rules for Daylight Saving Time
	    pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
	    pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

	    // create a GregorianCalendar with the Pacific Daylight time zone
	    // and the current date and time
	    Calendar calendar = new GregorianCalendar(pdt);
	    Date trialTime = new Date();
	    calendar.setTime(trialTime);

	    // print out a bunch of interesting things
	    System.out.println("ERA: " + calendar.get(Calendar.ERA));
	    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
	    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
	    System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
	    System.out.println("DATE: " + calendar.get(Calendar.DATE));
	    System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
	    System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
	    System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
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
	    calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
	    calendar.set(Calendar.HOUR, 3);
	    System.out.println("ERA: " + calendar.get(Calendar.ERA));
	    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
	    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
	    System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
	    System.out.println("DATE: " + calendar.get(Calendar.DATE));
	    System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
	    System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
	    System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
	    System.out.println("DAY_OF_WEEK_IN_MONTH: "
	                       + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
	    System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
	    System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
	    System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
	    System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
	    System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
	    System.out.println("ZONE_OFFSET: "
	           + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
	    System.out.println("DST_OFFSET: "
	           + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours 
	    
	}


    //
    //
    //
	@SuppressWarnings("deprecation")
	public void ourCalendar(){ 
    	Locale   url = Locale.US; 
    	Calendar calendar  = Calendar.getInstance();
    	
	    System.out.println( date.toGMTString() );
	    System.out.println( date.toGMTString() );

	}

    //
    //
    //
	public void timing(){ 

	}

	//
	//
	//
    public void serverSide(){
//		HttpURLConnection connect = new HttpURLConnection( url );
	    System.out.println("serverSide()");
    }	
}





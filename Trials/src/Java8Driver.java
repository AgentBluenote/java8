//  80 column spaces looks like this: 
//  AAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEFFFFFFFFFFGGGGGGGGGGHHHHHHHHHH

import annotations.PreambleAnnotation;
import annotations.Schedule;

/**
 * @author Michael Doe
 * @version     %I%, %G%
 * @since       1.0
 *
 */

@PreambleAnnotation (
   author = "Michael Doe",
   email =   "michaeldoe@yahoo.com")
public class Java8Driver{

	public Java8Driver() {
		System.out.println("Inside Constructor: Java8Driver \n");
    }
	
	@PreambleAnnotation (
			   author = "Jane Doe",
			   email =   "emailyahoo.com" )	
	 @Schedule(dayOfMonth="last")
	public void iLoveCSULB(){
		System.out.println("\nHello World, I love CSULB");
	}
    
	/**
	 * @param args   main argument
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

 //  		Java8Driver driver  = new Java8Driver();
   		CronTab cron  = new CronTab();
 // 	    ClassPreambleAnnotationHelper preamble = new ClassPreambleAnnotationHelper();


//		cron.scheduleAtJob();
		cron.scheduleCronJob();

//		System.out.println("author: " +
//			PreambleAnnotationHelper.extractAuthor( driver.getClass()));
//		String temp =	PreambleAnnotationHelper.extractAuthor( driver.getClass());

//		System.out.println("date: " +
//			PreambleAnnotationHelper.extractDate( driver.getClass()));

//		driver.iLoveCSULB();

	}
}

//  80 column spaces looks like this: 
//  AAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEFFFFFFFFFFGGGGGGGGGGHHHHHHHHHH

import annotations.ClassPreambleAnnotation;

/**
 * @author Michael Archam
 * @version     %I%, %G%
 * @since       1.0
 *
 */

@ClassPreambleAnnotation (
   author = "Michael A Doe",
   date =   "3/17/2002",
   currentRevision = 6,
   lastModified = "4/12/2004",
   lastModifiedBy = "Jane Doe",
   reviewers = {"Alice", "Bob", "Cindy"} 
   )
public class Java8Driver{

	public Java8Driver() {
		System.out.println("Inside Constructor: Java8Driver \n");
    }
    
	/**
	 * @param args   main argument
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
   		Java8Driver driver  = new Java8Driver();
   		CronTab cron  = new CronTab();

   	    ClassPreambleAnnotationHelper2 
				preamble = new ClassPreambleAnnotationHelper2(driver.getClass());

   	    String el_string = new String("");

//		cron.scheduleAtJob();
//		cron.scheduleCronJob();
//		preamble.PreambleElements();
//		System.out.println("author" +
//			ClassPreambleAnnotationHelper2.extractAuthor( driver));

		el_string = preamble.extractAuthor( driver.getClass());
		System.out.println("el_string " + el_string);

		System.out.println("\nHello World, I love CSULB");
	}
}

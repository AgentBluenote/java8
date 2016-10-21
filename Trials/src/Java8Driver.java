//  80 column spaces looks like this: 
//  AAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEFFFFFFFFFFGGGGGGGGGGHHHHHHHHHH

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import annotations.ClassPreambleAnnotation;
import annotations.Schedule;
import annotations.ScheduleContainer;

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
	
	public void extractPreambleElements() {
//		Method method = null;

		System.out.println("** Inside extractPreambleElements() \n");
		
		/*
		 * get class instance. 
		 */
		Class<Java8Driver> klass = Java8Driver.class;
		
		/*
		 *  Pull out annotated method because @ClassPreamble is defined at 
		 *  method level.  @Target(ElementType.METHOD)    
		 */
		/*
		try {                
	        method = klass.getMethod("extractPreambleElements");  
	        System.out.println("OBJECT: method = " + method.toString());        
	     }
	     catch(NoSuchMethodException e) {
	        System.out.println(e.toString());
	     }
	     */

		/*
		 *  Pull out annotated method because @ClassPreamble is defined at 
		 *  method level.  @Target(ElementType.METHOD)    
		 */
		Annotation[] annotations = klass.getDeclaredAnnotations();

        System.out.println("OBJECT[]: annotations.length = " + 
        					annotations.length + "\n");        

		for(Annotation annotation : annotations){
		    if(annotation instanceof ClassPreambleAnnotation){
		        System.out.println(
		        		"Annotation found: lets pull out meta-data... ");

		        ClassPreambleAnnotation anno_ClassPreambleAnnotation = 
		        		(ClassPreambleAnnotation) annotation;
		        System.out.println(
		        		"OBJECT: ClassPreambleAnnotation.author()         : " 
		        				+ anno_ClassPreambleAnnotation.author());
		        System.out.println(
		        		"OBJECT: ClassPreambleAnnotation.date()           : " 
		        				+ anno_ClassPreambleAnnotation.date());
		        System.out.println(
		        		"OBJECT: ClassPreambleAnnotation.currentRevision(): " 
		        				+ anno_ClassPreambleAnnotation.currentRevision());
		        System.out.println(
		        		"OBJECT: ClassPreambleAnnotation.lastModified()   : " 
		        				+ anno_ClassPreambleAnnotation.lastModified());
		    }
		}
	}

	/**
	 * @deprecated
	 * I dinn't really like this method so I took the liberty to make is 
	 * deprecated. 
	 */
    @Deprecated
	public void doDeprecatedTest() {
		// TODO Auto-generated constructor stub
		System.out.println("** Inside is doDeprecatedTest()\n");
		System.out.println(
				"This method illistrates @Deprecated meta-annotation");
		System.out.println(
				"    See docs directory after Project--> Generate Javadoc\n");
	}
    

	/**
	 * @param args   main argument
	 */
	public static void main(String[] args) {

		Java8Driver java8_driver  = new Java8Driver();

/* 
 * 
 *      MIKE: this is syntax to instantiate an innerclass
 * 		CronTab cron  = java8_driver.new CronTab();
 */
   		CronTab cron  = new CronTab();

//		java8_driver.extractPreambleElements();
		java8_driver.doDeprecatedTest();
		
		cron.doPeriodicCleanup();


		System.out.println("\nHello World, I love CSULB");

	}
}

package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;

/**
 * @author Michael Archam
 *
 */
@ClassPreambleAnnotation (
			   author = "Michael A Doe",
			   date = "3/17/2002",
			   currentRevision = 6,
			   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",
			   // Note array notation
			   reviewers = {"Alice", "Bob", "Cindy"} )
public class AnnotationsDriver{

	public AnnotationsDriver() {
		System.out.println("Inside Constructor: AnnotationsDriver \n");
	}

	/*
	@ClassPreambleAnnotation (
			   author = "Michael A Doe",
			   date = "3/17/2002",
			   currentRevision = 6,
			   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",
			   // Note array notation
			   reviewers = {"Alice", "Bob", "Cindy"} )
			   */
	public void classPreambleAnnotationTest() {

		System.out.println("** Inside ClassPreambleAnnotationTest()");

		/*
		 * get class instance. 
		 */
		Class<AnnotationsDriver> this_class = AnnotationsDriver.class;

//		AnnotatedElement anno_element = AnnotationsDriver.class; 

		if (this_class.isAnnotationPresent(ClassPreambleAnnotation.class ) ){
			System.out.println("annotation IS present\n");
		} 
		else{
		System.out.println("annotation NOT present\n");
		}
	}

	/**
	 * @deprecated
	 * explanation of why it was deprecated
	 */
    @Deprecated
	public void DeprecatedTest() {
		// TODO Auto-generated constructor stub
		System.out.println("** Inside is DeprecatedTest()");
	}
    
    
//   

    @Schedule(dayOfMonth="last")
    @Schedule(dayOfWeek="Fri", hour="23")
    public void doPeriodicCleanup() { 

		System.out.println("\n");
		System.out.println("Inside doPeriodicCleanup()\n");

		/*
		 * get class instance. 
		 */
		Class<AnnotationsDriver> this_class = AnnotationsDriver.class;

		AnnotatedElement anno_element = AnnotationsDriver.class; 

		if (this_class.isAnnotationPresent(Schedule.class)){
			System.out.println("annotation present\n");
		} 
		else{
			System.out.println("annotation NOT present\n");
			
		}
		
		/*
		 *  Pull out annotations. 
		 */
		Annotation[] annotationsByType = this_class.getAnnotationsByType(Schedules.class);
	         System.out.print("annotationsByType.length " + annotationsByType.length + "\n");
		
		 for (Annotation a  : annotationsByType) {
	         System.out.print(a+ " ");
	      }


	}


    // Inner class 
    public class InnerClassIllistration{

        public InnerClassIllistration(){
        	System.out.println("\n");
        }
    }	
	

	/**
	 * @param args   main argument
	 */
	public static void main(String[] args) {

		AnnotationsDriver driver  = new AnnotationsDriver();
		InnerClassIllistration inner_class  = driver.new  InnerClassIllistration();

		driver.classPreambleAnnotationTest();
		driver.DeprecatedTest();
		driver.doPeriodicCleanup();

		System.out.println("\nHello World, I love CSULB");

	}
}

package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * @author Michael Archam
 *
 */
public class AnnotationsDriver{

	public AnnotationsDriver() {
		System.out.println("Inside Constructor: AnnotationsDriver \n");
	}

	@ClassPreambleAnnotation (
			   author = "Michael A Doe",
			   date = "3/17/2002",
			   currentRevision = 6,
			   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",
			   // Note array notation
			   reviewers = {"Alice", "Bob", "Cindy"} )
	public void classPreambleAnnotationTest() {
		Method method = null;

		System.out.println("** Inside ClassPreambleAnnotationTest()\n");
		
		/*
		 * get class instance. 
		 */
		Class<AnnotationsDriver> this_class = AnnotationsDriver.class;
		
		/*
		 *  Pull out annotated method because @ClassPreamble is defined at method level.  @Target(ElementType.METHOD)    
		 */
		try {                
	        method = this_class.getMethod("classPreambleAnnotationTest");  
	        System.out.println("method = " + method.toString());        
	     }
	     catch(NoSuchMethodException e) {
	        System.out.println(e.toString());
	     }

		/*
		 *  Pull out annotated method because @ClassPreamble is defined at method level.  @Target(ElementType.METHOD)    
		 */
		Annotation[] annotations = method.getDeclaredAnnotations();

        System.out.println("annotations.length = " + annotations.length + "\n");        

		for(Annotation annotation : annotations){
		    if(annotation instanceof ClassPreambleAnnotation){
		        System.out.println("Annotation found: lets pull out meta-data... ");

		        ClassPreambleAnnotation myAnnotation = (ClassPreambleAnnotation) annotation;
		        System.out.println("author: " + myAnnotation.author());
		        System.out.println("date: " + myAnnotation.date() );
		    }
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
    
    @Schedule(dayOfMonth="last")
    @Schedule(dayOfWeek="Fri", hour="23")
    public void doPeriodicCleanup() { 

		System.out.println("\n");
		System.out.println("** Inside doPeriodicCleanup()\n");

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

		
		
//		driver.DeprecatedTest();
		driver.doPeriodicCleanup();
		driver.classPreambleAnnotationTest();


		System.out.println("\nHello World, I love CSULB");

	}
}

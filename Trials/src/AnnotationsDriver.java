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
public class AnnotationsDriver{

	public AnnotationsDriver() {
		System.out.println("Inside Constructor: AnnotationsDriver \n");
	}

	@ClassPreambleAnnotation (
			   author = "Michael A Doe",
			   date =   "3/17/2002",
			   currentRevision = 6,
			   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",
			   reviewers = {"Alice", "Bob", "Cindy"} )
	public void doclassPreambleAnnotationTest() {
		Method method = null;

		System.out.println("** Inside ClassPreambleAnnotationTest() \n");
		System.out.println("This method illistrates @Document mete-annotation");
		System.out.println("    See docs directory after Project--> Generate Javadoc\n");
	}

	/**
	 * @deprecated
	 * explanation of why it was deprecated 
	 */
    @Deprecated
	public void doDeprecatedTest() {
		// TODO Auto-generated constructor stub
		System.out.println("** Inside is doDeprecatedTest()\n");
		System.out.println("This method illistrates @Deprecated meta-annotation");
		System.out.println("    See docs directory after Project--> Generate Javadoc\n");
	}
    
    @Schedule(dayOfMonth="last")
    @Schedule(dayOfWeek="Fri", hour="23")
    public void doPeriodicCleanup() { 
		Method method = null;

		System.out.println("** Insidep doPeriodicCleanup()\n");
		
		/*
		 * get class instance. 
		 */
		Class<AnnotationsDriver> this_class = AnnotationsDriver.class;
		
		/*
		 *  Pull out annotated method because @Schedule is defined at method level.  
		 *  @Target(ElementType.METHOD)    
		 */
		try {                
	        method = this_class.getMethod("doPeriodicCleanup");  
	        System.out.println("OBJECT: method = " + method.toString());        
	     }
	     catch(NoSuchMethodException e) {
	        System.out.println(e.toString());
	     }

		/*
		 *  get annotations from Method object. 
		 *  When annotation is marked @Repeatable the Conntainer annotation is returned. 
		 */
		Annotation[] annotations = method.getDeclaredAnnotations();

        System.out.println("OBJECT[]: annotations.length = " + annotations.length + "\n");        

		for(Annotation element : annotations){
			/*
			 *   Need to check for Container annotation for @Schedule 
			 *   because it is marked as @Repeatable.  
			 */
		    if(element instanceof ScheduleContainer){
		        System.out.println("@ScheduleContainer found: lets pull out meta-data... ");

		        ScheduleContainer anno_ScheduleContainer = (ScheduleContainer)element;

  			   /*
			    *   pull values out of the container 
			    */
		        Schedule[] value_ScheduleContainer = anno_ScheduleContainer.value(); 

		        System.out.println("OBJECT: value_ScheduleContainer.length: " + value_ScheduleContainer.length );

  			   /*
			    *   pull values out of the container 
			    */
		        for(Schedule index : value_ScheduleContainer){
		        	Schedule Schedule_element = (Schedule)index;

		        	System.out.println("OBJECT: Schedule_element.dayOfMonth(): " + Schedule_element.dayOfMonth() );
		        	System.out.println("OBJECT: Schedule_element:dayOfWeek() " + Schedule_element.dayOfWeek() );
		        	System.out.println("OBJECT: Schedule_element:hour() " + Schedule_element.hour() );
		        }
		    }
		}
	}

    // Inner class  MIKE
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

//		InnerClassIllistration inner_class  = driver.new  InnerClassIllistration();

		driver.doclassPreambleAnnotationTest();
		driver.doDeprecatedTest();
		driver.doPeriodicCleanup();


		System.out.println("\nHello World, I love CSULB");

	}
}

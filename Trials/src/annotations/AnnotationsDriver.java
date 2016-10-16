package annotations;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.util.Iterator;

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
		// TODO Auto-generated constructor stub
		System.out.println("This method is ClassPreambleAnnotationTest");
	}

	/**
	 * @deprecated
	 * explanation of why it was deprecated
	 */
    @Deprecated
	public void DeprecatedTest() {
		// TODO Auto-generated constructor stub
		System.out.println("This method is deprecated");
	}

    
	
	
	

    // Inner class 
    public class InnerClassIllistration{

        public InnerClassIllistration(){
        	System.out.println("Inside Constructor: InnerClassIllistration \n");
        	System.out.println("Annotation could not be defined in inner class \n");
        	System.out.println("  said it had to be a top-level class, interface, or static \n");
        }
    }	
	

	/**
	 * @param args   main argument
	 */
	public static void main(String[] args) {

		AnnotationsDriver driver  = new AnnotationsDriver();
//		InnerClassIllistration inner_class  = new InnerClassIllistration();
		InnerClassIllistration inner_class  = driver.new  InnerClassIllistration();

		driver.DeprecatedTest();

		driver.classPreambleAnnotationTest();

		System.out.println("Hello World, I love CSULB");

	}
}

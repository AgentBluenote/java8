/**
 * 
 */

/**
 * @author Michael Archam
 *
 */

// Michael 
// Michael 
// Michael 
// revisiting Generic code 
// learn @Target, @Retention  ( meta annotations )


public class AnnotationsDriver {


	public AnnotationsDriver() {
		// TODO Auto-generated constructor stub
		
		System.out.println("AnnotationsDriver \n");
		
	}

	@ClassPreamble (
			   author = "Michael A Doe",
			   date = "3/17/2002",
//			   currentRevision = 6,
			   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",
			   // Note array notation
			   reviewers = {"Alice", "Bob", "Cindy"} )

	public void annotation_test_1() {
		// TODO Auto-generated constructor stub
		System.out.println("This method is annotation_test_1");
	}

    @Deprecated
	public void DeprecatedTest() {
		// TODO Auto-generated constructor stub
		System.out.println("This method is deprecated");
	}

	/**
	 * @param args   main argument
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationsDriver mike  = new AnnotationsDriver();
		mike.DeprecatedTest();

		mike.annotation_test_1();

		System.out.println("Hello World, I love CSULB");

	}

}

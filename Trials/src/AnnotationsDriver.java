/**
 * 
 */

/**
 * @author Michael
 *
 */

// Michael
// learn @Target, @Retention  ( meta annotations )


public class AnnotationsDriver {

	/**
	 * 
	 */
	@ClassPreamble (
			   author = "Michael Doe",
			   date = "3/17/2002",
//			   currentRevision = 6,
//		   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",

			   // Note array notation
			   reviewers = {"Alice", "Bob", "Cindy"}
			)
	public AnnotationsDriver() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Whello World");
		
	}

    @Deprecated
	public void DeprecatedTest() {
		// TODO Auto-generated constructor stub
		
		System.out.println("This method is deprecated");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationsDriver mike  = new AnnotationsDriver();
		mike.DeprecatedTest();
		System.out.println("Hello World, I love CSULB");

	}

}

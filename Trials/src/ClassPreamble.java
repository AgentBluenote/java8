import java.lang.annotation.Documented;

// Mike: This is how you declare annotations
// Mike: The body of the previous annotation definition contains annotation type element declarations, 
//       which look a lot like methods. 
//		( default ) Note that they can define optional default values.

@Documented
@interface ClassPreamble {  // implicitly public:
    String author();   
	String date();
//	int currentRevision() default 1;       // default parameters
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	// Note use of array
	String[] reviewers();
}

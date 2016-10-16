package annotations;
import java.lang.annotation.Documented;


/**
*  Mike: This is how you declare annotations
* 
* @author      Michel AA 
* @version     %I%, %G%
* @since       1.0
*
*/
@Documented
public @interface ClassPreambleAnnotation {  
    String author();        
	String date();
  	int currentRevision() default 1;       
	String lastModified() default "N/A";    // MIKE: "annotation type elements" can have a default.   
	String lastModifiedBy() default "N/A";
	// Note use of array
	String[] reviewers();
}

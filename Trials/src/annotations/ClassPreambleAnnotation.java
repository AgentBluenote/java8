package annotations;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;


/**
 * 
 * @author      Michel A
 * @version     %I%, %G%
 * @since       1.0
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME) // default Retention is RetentionPolicy.CLASS) 
@Target(ElementType.METHOD) 
public @interface ClassPreambleAnnotation {  
	
    String author();        
	String date();
  	int currentRevision() default 1;       
	String lastModified() default "N/A";    // MIKE: "annotation type elements" can have a default.   
	String lastModifiedBy() default "N/A";
	// Note use of array
	String[] reviewers();
}

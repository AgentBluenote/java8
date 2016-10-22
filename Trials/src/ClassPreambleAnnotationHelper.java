import java.lang.annotation.Annotation;

import annotations.ClassPreambleAnnotation;

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
public class ClassPreambleAnnotationHelper {

	public void PreambleElements() {
//		Method method = null;

		System.out.println("** Inside PreambleElements() \n");
		
		/*
		 * get class instance. 
		 */
		Class<Java8Driver> klass = Java8Driver.class;
		
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
}

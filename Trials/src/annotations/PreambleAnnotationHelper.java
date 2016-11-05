package annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import annotations.PreambleAnnotation;

/**
 * @author Michael Doe
 * @version     %I%, %G%
 * @since       1.0
 *
 */

public class PreambleAnnotationHelper{

	public PreambleAnnotationHelper(){
		System.out.println("** Inside Constructor() \n");
	}

	public static String extractAuthor(Class<?> klass) {
		String author = null; 

		System.out.println("** Inside extractAuthor()");
        System.out.println("klass = " + klass.getName() + "\n");        
		
		Annotation[] annotations = klass.getDeclaredAnnotations();
		
        System.out.println("VARIABLE[]: annotations.length = " + 
        					annotations.length + "\n");        
        

        // MIKE, how to find the type of annotation and not use "instanceof"

		for(Annotation element : annotations){

		    if(element instanceof PreambleAnnotation){
		        System.out.println(
		        		"Annotation found: lets pull out meta-data... ");

		        PreambleAnnotation anno_PreambleAnnotation = 
		        		(PreambleAnnotation) element;

                author = anno_PreambleAnnotation.author();

		        System.out.println(
		        		"VARIABLE: PreambleAnnotation.author()           : " 
		        		+ author );
		    }
		}
		return author;
	}

	public static String extractDate(Class<?> klass) {
		String email = null; 

		System.out.println("** Inside extractDate() method. \n");
		
		Annotation[] annotations = klass.getDeclaredAnnotations();


        System.out.println("VARIABLE[]: annotations.length = " + 
        					annotations.length + "\n");        

		for(Annotation element : annotations){

		    if(element instanceof PreambleAnnotation){
		        System.out.println(
		        		"Annotation found: lets pull out meta-data... ");

		        PreambleAnnotation anno_PreambleAnnotation = 
		        		(PreambleAnnotation) element;

                email = anno_PreambleAnnotation.email();

		        System.out.println(
		        		"VARIABLE: PreambleAnnotation.email()           : " 
		        		+ email );
		    }
		}
		return email;
	}
}




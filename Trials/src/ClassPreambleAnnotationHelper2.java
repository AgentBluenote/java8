import java.lang.annotation.Annotation;

import annotations.ClassPreambleAnnotation;

/**
 * @author Michael Archam
 * @version     %I%, %G%
 * @since       1.0
 *
 */
/*
@ClassPreambleAnnotation (
   author = "Michael A Doe",
   date =   "3/17/2002",
   currentRevision = 6,
   lastModified = "4/12/2004",
   lastModifiedBy = "Jane Doe",
   reviewers = {"Alice", "Bob", "Cindy"} 
   )
   */
public class ClassPreambleAnnotationHelper2{

	public ClassPreambleAnnotationHelper2(Class klass){
//		System.out.println("** Inside Constructor() \n");
	}

	public  String extractAuthor(Class klass) {
		String author = null; 

		System.out.println("** Inside extractAuthor() \n");
		
		/*
		 * get class instance. 
		 */
//		Class<ClassPreambleAnnotation> klass = ClassPreambleAnnotation.class;
		
		Annotation[] annotations = klass.getDeclaredAnnotations();

        System.out.println("OBJECT[]: annotations.length = " + 
        					annotations.length + "\n");        

		for(Annotation element : annotations){
		    if(element instanceof ClassPreambleAnnotation){
		        System.out.println(
		        		"Annotation found: lets pull out meta-data... ");

		        /*
		         * MIKE:  I have to cast here because I did not make the 
		         *        annotation Generic.
		         */
		        ClassPreambleAnnotation anno_ClassPreambleAnnotation = 
		        		(ClassPreambleAnnotation) element;

                author = anno_ClassPreambleAnnotation.author();

		        System.out.println(
		        		"OBJECT: ClassPreambleAnnotation.author()           : " 
		        		+ author );
		    }
		}
		return author;
	}

	public  String extractDate(ClassPreambleAnnotation preamble) {
		String date = null; 

		System.out.println("** Inside ClassPreambleAnnotationHelper2() \n");
		
		/*
		 * get class instance. 
		 */
		Class<ClassPreambleAnnotation> klass = ClassPreambleAnnotation.class;
		
		Annotation[] annotations = klass.getDeclaredAnnotations();

        System.out.println("OBJECT[]: annotations.length = " + 
        					annotations.length + "\n");        

		for(Annotation element : annotations){
		    if(element instanceof ClassPreambleAnnotation){
		        System.out.println(
		        		"Annotation found: lets pull out meta-data... ");

		        /*
		         * MIKE:  I have to cast here because I did not make the 
		         *        annotation Generic.
		         */
		        ClassPreambleAnnotation anno_ClassPreambleAnnotation = 
		        		(ClassPreambleAnnotation) element;

                date = anno_ClassPreambleAnnotation.date();

		        System.out.println(
		        		"OBJECT: ClassPreambleAnnotation.date()           : " 
		        		+ date );
		    }
		}
		return date;
	}
}




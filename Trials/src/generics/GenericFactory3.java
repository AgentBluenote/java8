package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  Purpose:
 *  
 *  1.  first attempt to make a factory method that returns a generic Type
 *  	    like "List<>" or "ArrayList<>" 
 *      ArrayList<> is Generic 
 *     
 *      Trying two understand how Generics work with polymorphism.. 
 *      Basically testing "Call by Value, Call by Reference
 */
public class GenericFactory3 {
	/*
	 *   Trying to see if I can populate a list inside a method and make it stick.
	 *   by in/out parameter instead of return
	 */

	public <T> void factoryMethod( ArrayList<T> thelist ){
		Class<?> klazz = null;
		
		klazz = thelist.getClass();

    	T elementType = null; 


		System.out.println("\nTrace: Inside factoryMethod\n");	

		System.out.println("\nTrace: klass = " + klazz);	
    	
//    	klazz = elementType.getClass();

		// collections class has no constructor and static methods
        // collections is raw class 
//		        if( Collections.addAll( intBuffer, int1, int2) == true ){
		        if( Collections.addAll( thelist, elementType) == true ){
//		            System.out.println("elementType.length  = " + elementType.size());	
		        }

	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericFactory3 max = new GenericFactory3();

		ArrayList<?> unknown = null; 
		Class<?> klass = null;
//		System.out.println("Trace: inside main()");	
		
		unknown = new ArrayList<String>();
		
		klass = unknown.getClass();
		
		klass.getCanonicalName();
		System.out.println("mmmm klass");	
		/*  
		 *  return ArrayList of Integer type
		 */ 
	    max.factoryMethod( unknown );

        for( int i=0; i < unknown.size(); i++ ){
           System.out.println("unknown[i] = " +  unknown.get(i) );
        }

		/*  
		 *  return ArrayList of String type
		 */ 
        /*
	    unknown = max.factoryMethod( "String" );
        for( int i=0; i < unknown.size(); i++ ){
           System.out.println("unknown[i] = " +  unknown.get(i) );
        }
        */
	}
}

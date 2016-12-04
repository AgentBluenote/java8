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
 */
public class GenericFactory3 {
	/*
	 *  factory method
	 *  return different types <Integer> <Double> <String>
	 */
	public List<T extends Object> factoryMethod( String type, List<T> thelist ){

	//	List<? extends Object> retValue = null;

    	T retValue = null; 

		System.out.println("\nTrace: Inside factoryMethod\n");	

		switch( type ){
			case("Integer"):
  			    Integer int1 = new Integer(32);
  			    Integer int2 = new Integer(64);

				System.out.println("case: Integer");	

				ArrayList<Integer> intBuffer = new ArrayList<>();
				
				//null to non-null
				retValue = intBuffer;

				// collections class has no constructor and static methods
		        // collections is raw class 
		        if( Collections.addAll( intBuffer, int1, int2) == true ){
//		            System.out.println("retValue.length  = " + retValue.size());	
		        }
			break;
			/*

			case("String"):
  			    String string1 = new String("String 32");
  			    String string2 = new String("SString 64");

				System.out.println("case: String");	

				ArrayList<String> stringBuffer = new ArrayList<>();
				
				//null to non-null
				retValue = stringBuffer;

				// collections class has no constructor and static methods
		        // collections is raw class 
		        if( Collections.addAll( stringBuffer, string1, string2) == true ){
//		            System.out.println("retValue.length  = " + retValue.size());	
		        }
			break;

			default:
				System.out.println("default");	
			*/
		} // switch

		return retValue;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericFactory2 max = new GenericFactory2();
		List<?> unknown = null; 
//		System.out.println("Trace: inside main()");	
		
		/*  
		 *  return ArrayList of Integer type
		 */ 
	    unknown = max.factoryMethod( "Integer" );

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

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
 *      Trying to understand how Generics work with polymorphism 
 */
public class GenericFactory {
	/*
	 *  factory method
	 *  return different types <Integer><Double> <String>
	 */
	public ArrayList<?> factoryMethod( String type ){

		ArrayList<?> retValue = null;

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
		} // switch

		return retValue;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericFactory max = new GenericFactory();
		List<?> unknown = null; 
//		System.out.println("Trace: inside main()");	
		
		/*  
		 *  return ArrayList of Integer type
		 */ 
	    unknown = max.factoryMethod( "Integer" );

//        /*  for each loop does not work
//        for( Integer iii: unknown<?> ){

 //       }
//       */
        for( int i=0; i < unknown.size(); i++ ){
           System.out.println("unknown[i] = " +  unknown.get(i) );
        }

		/*  
		 *  return ArrayList of String type
		 */ 
	    unknown = max.factoryMethod( "String" );
        for( int i=0; i < unknown.size(); i++ ){
           System.out.println("unknown[i] = " +  unknown.get(i) );
        }
	}

	
	//MIKE case 3:
	
	/**  
	 * MIKE: just an example for Integer.java
	 *       check for "logical equality" 
	 * 
     * Compares this object to the specified object.  The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is an {@code Integer} object that
     * contains the same {@code int} value as this object.
     *
     * @param   obj   the object to compare with.
     * @return  {@code true} if the objects are the same;
     *          {@code false} otherwise.
    public boolean equals(Object obj) {
        if (obj instanceof HeapPollution) {
            return value == ((HeapPollution)obj).intValue();
        }
        return false;
    }
     */
    
    /**
	 * MIKE: just an example for Integer.java
	 * 
     * Returns a hash code for this {@code Integer}.
     *
     * @return  a hash code value for this object, equal to the
     *          primitive {@code int} value represented by this
     *          {@code Integer} object.
      @Override
      public int hashCode() {
        return Integer.hashCode(value);
      }
     */

    /*
      @Override
        public static String toString() { 
      }

     */
	
	
	
	
	

}

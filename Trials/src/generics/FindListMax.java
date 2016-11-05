package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/*
 * Write a generic method to find the maximal element in the range [begin, end) 
 * of a list
 */
public class FindListMax {

	/*
     *  public static <T> T findMaxelement( List<T> thelist,  
     *  									int begin, int end){
	 * 
	 */
    public static <T extends Comparable<T>> T findMaxelement( List<T> thelist, 
    														int begin, int end){
    	T max_element = thelist.get(begin);
    	T temp = null;
    	
    	for(int index = begin; index < end ; index++ ){

    		temp = thelist.get(index);

    		if( temp.compareTo(max_element) >= 0 ){
    			max_element = temp;  
    		} 
    	}

       return max_element;	
    } 	
    
	/*
	 * factory method
	 *  return different types <Integer><Double> <String>
	 */
//	public ArrayList<?> clientCode( String type ){
	public static void clientCode( String type ){

		System.out.println("Inside clientCode");	

//		ArrayList<? extends Object> retValue = new ArrayList<>();

		switch( type ){

			case("Integer"):
				System.out.println("Integer");	
  			    Integer obj1 = new Integer(1);
  			    Integer obj2 = new Integer(2);

				ArrayList<Integer> jit = new ArrayList<>();
///				jit.add(obj1);
//				jit.add(obj2);

				// interface
		        Collection<?> col = null; 


		        if( Collections.addAll(jit,obj1,obj2) == true ){
		        System.out.println("length = " + jit.size());	
		        }

				// collections class has no constructor and static methods
			//raw

				jit.add(obj1);


			break;

			case("String"):
//				ArrayList<String> stringList = new ArrayList();
//				Collection<Object> objList = null; 
//				Collections nonG = new Collections();

//			    stringList.add("one");
//			    stringList.add("two");
			break;

			default:
				System.out.println("default");	
		} // switch
//		return ret2;	
//		return retValue;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object maxReturn = null;


		List<Integer> integerList = new ArrayList<>();

	    FindListMax.clientCode( "Integer" );

		integerList.add(1);
		integerList.add(3);
		integerList.add(7);
		integerList.add(44);

        maxReturn = FindListMax.findMaxelement(integerList, 0, 4);
        System.out.println("maxReturn for Integer = " + maxReturn);

//	    stringList = clientCode( "String" ){
		List<String> stringList = new ArrayList<>();
		stringList.add("three");
		stringList.add("one");
		stringList.add("zeta");
		stringList.add("ada");
		stringList.add("beta");

        maxReturn = FindListMax.findMaxelement(stringList, 0, 4);
        System.out.println("maxReturn for String = " + maxReturn);

	}
	
	
	public <T> List<T> magicalListGetter(Class<T> klazz) {
		Object actuallyT = null;
	    List<T> list = new ArrayList<>();
	    list.add(klazz.cast(actuallyT));
	    try {
	        list.add(klazz.getConstructor().newInstance()); // If default constructor
	    } 
	    catch(Exception e){
			System.out.println("some exception has occured");	
	    	e.printStackTrace();
	    }
	    finally{
			System.out.println("finally block is alway execute after a try");	
			System.out.println("must be declared after exections");	
			System.out.println("try block can be exited not only bye");	
			System.out.println("exceptions but by; return, continue, break");	
			System.out.println("Just keep that in mind");	
	    }

	    return list;
	}
	
	
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
     */
    public boolean equals(Object obj) {
        if (obj instanceof FindListMax) {
//            return value == ((FindListMax)obj).intValue();
        }
        return false;
    }
    
    /**
	 * MIKE: just an example for Integer.java
	 * 
     * Returns a hash code for this {@code Integer}.
     *
     * @return  a hash code value for this object, equal to the
     *          primitive {@code int} value represented by this
     *          {@code Integer} object.
     */
 //   @Override
//    public int hashCode() {
 //       return Integer.hashCode(value);
//    }

//      @Override this method too.
//    public static String toString() {
     
}



 // MIKE Ctrl-R -- redo 
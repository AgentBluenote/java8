//  80 column spaces looks like this: 
//  AAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEFFFFFFFFFFGGGGGGGGGGHHHHHHHHHH


package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Integer;

public class Algorithm {
	/*  
	 *  Problem Definition:
	 *  
	 *  Write a generic method to count the number of elements in a collection 
	 *  that have a specific property (for example, odd integers<Interger>, 
	 *  prime numbers<Interger>, palindrome<String>).
	 */

	// MIKE
//	public interface PropertyTest<T> {
//	    public boolean test(T obj);
//	} 
	

    public <T> int countProperty(Collection<T> c, 
    				 	   PropertyTest<T> property) {
        int count = 0;
        for (T elem : c)
            if (property.test(elem))
                ++count;
        return count;
    }

    /*
     *   Test Type 1 
     */
    public class OddIntegersTest implements PropertyTest<Integer>
    {
    	//  test for property
    	public boolean test(Integer obj) 
    	{ 
    		return obj % 2 != 0; 
    	}
    }

    /*
     *   new type 2 
     */
    public class PalindromeTest implements PropertyTest<String>
    {
    	//  test for palindrome 
    	public boolean test(String phrase) 
    	{ 
//    	    String phrase1 = new String("madam");
    		char[] chararray = phrase.toCharArray();
    		int back_index = chararray.length;
    		boolean retValue = false; 

    		--back_index;

    		for( char elem: chararray ){
   			    if ( elem == back_index )
  					break;
    			if( elem == chararray[back_index] ){ 
    				retValue = true;
     			    System.out.println("jit" +  elem);
    			}
    			else{
    				retValue = false ;
     			    System.out.println("false" +  elem);
     			    break;
    			}
    			--back_index;
    		} 

    		return retValue;
   		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elem_count;
				
		Algorithm myklass = new Algorithm();
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("ra");
		arr.add("madam");
//		arr.add("junkeven");
//	  	arr.add("junkodd");


		Collection<Integer> the_collection = Arrays.asList(1,2,3,4,5,6,7,8);
		PropertyTest oddint_test = myklass.new OddIntegersTest();

		Collection<String> str_collection = arr;
		PropertyTest palindrome_test = myklass.new PalindromeTest();
palindrome_test.test("radar");

		elem_count = myklass.countProperty( the_collection, 
		  							  oddint_test );

		System.out.println("TEST CASE 1:  the # of elements is: " +  elem_count);

		elem_count = myklass.countProperty( str_collection, 
		  							  palindrome_test );

		System.out.println("TEST CASE 2:  the # of elements is: " +  elem_count);

	}
}

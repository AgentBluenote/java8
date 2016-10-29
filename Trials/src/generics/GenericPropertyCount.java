//  80 column spaces looks like this: 
//  AAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEFFFFFFFFFFGGGGGGGGGGHHHHHHHHHH


package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Integer;

public class GenericPropertyCount {
	/*  
	 *  Problem Definition:
	 *  
	 *  Write a generic method to count the number of elements in a collection 
	 *  that have a specific property (for example, odd integers<Interger>, 
	 *  prime numbers<Interger>, palindrome<String>).
	 */

	public interface PropertyTest<T> {
	    public boolean test(T obj);
	} 
	

    public static <T> int countProperty(Collection<T> c, 
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
     *   test for palindrome 
     */
    public class PalindromeTest implements PropertyTest<String>
    {
    	//  test for palindrome 
    	public boolean test(String phrase) 
    	{ 
    		char[] chararray = phrase.toCharArray();
    		int back_index = chararray.length;
    		boolean retValue = false; 

    		--back_index;

    		for( char elem: chararray ){
   			    if ( elem == back_index )
  					break;
    			if( elem == chararray[back_index] ){ 
    				retValue = true;
     			    System.out.println("elem = " +  elem);
    			}
    			else{
    				retValue = false ;
//     			    System.out.println("false" +  elem);
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
				
		GenericPropertyCount myklass = new GenericPropertyCount();
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("madam");
		stringArray.add("radar");
		stringArray.add("junkeven");
	  	stringArray.add("junkodd");


		Collection<Integer> the_collection = Arrays.asList(1,2,3,4,5,6,7,8);

		// MIKE what about "type witness <>" with inner classes
//		PropertyTest<Integer> oddint_test = myklass.new OddIntegersTest<>();

		PropertyTest<Integer> oddint_test = myklass.new OddIntegersTest();


//		Collection<String> str_collection = stringArray;
		PropertyTest<String> palindrome_test = myklass.new PalindromeTest();


		elem_count = GenericPropertyCount.countProperty( the_collection, 
		  							  oddint_test );

		System.out.println("TEST CASE 1:  the # of elements is: " +  elem_count);

		elem_count = GenericPropertyCount.countProperty( stringArray, 
		  							  palindrome_test );

		System.out.println("TEST CASE 2:  the # of elements is: " +  elem_count);

	}
}

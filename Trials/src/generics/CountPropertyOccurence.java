// Michael: git test 1
// Michael: git test 2
// Michael: git test 3
// Michael: git test 4
// Michael: git test 4

package generics;
import java.util.Arrays;
import java.util.Collection;

import java.lang.Integer;

public class CountPropertyOccurence {
	/*  
	    Problem Definition:
	    Write a generic method to count the number of elements in a collection that have a 
	    specific property (for example, odd integers, prime numbers, palindrome<String>).
	 */
	private int number_of_occurances = 0;

	// default constructor
	public CountPropertyOccurence() {
		// TODO Auto-generated constructor stub
	}

	/*
	   I defined PropertyTest<T> interface to test for the property in questions. 
	   Remember, any and every single type can go into a collection spanning different class hierachys 
	   
	   --  
	 */
    public static <T> int countPropertyElements(Collection<T> c, PropertyTest<T> property) {

        int count = 0;
        for (T elem : c)
            if (property.test(elem))
                ++count;
        return count;
    }

    // This class is non generic but implements a generic interface
    // This is a concrete class so the interface<T> is paramiterized.
	//  Mike: Type of nested class which is referred to as a "static nested classes"  not an inner class ( non-static nested class )
    public static class OddIntegers implements PropertyTest<Integer>
    {
    	// constructor
    	public OddIntegers() {
	    }

    	//  test for property
    	public boolean test(Integer obj) 
    	{ 
    		return obj % 2 != 0; 
    	}
    }

    // This is a concrete class so the interface<T> is paramiterized.
    // Mike: (inner classes) have access to other members of the enclosing class, even if they are declared private. 
    public static class OddIntegers_inner implements PropertyTest<Integer>
    {
    	// constructor
    	public OddIntegers_inner() {
	    }

    	//  test for property
    	public boolean test(Integer obj) 
    	{ 
    		return obj % 2 != 0; 
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elem_count;
		
		// Arrays.asList returns a List<Integers>
		Collection<Integer> the_collection = Arrays.asList(1,2,3,4,5,6,7,8);

		OddIntegers property = new OddIntegers();
				
		elem_count = CountPropertyOccurence.countPropertyElements( the_collection, property );

		System.out.println("the # of elements is: " +  elem_count);

	}

}

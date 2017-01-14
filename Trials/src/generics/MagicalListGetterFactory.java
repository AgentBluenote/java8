package generics;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* 
 * This class should return a List<> of the specified type.
 * populated with values.  
 * 
 * List<User> users = magicalListGetter(User.class);
 * List<Vehicle> vehicles = magicalListGetter(Vehicle.class);
 * List<String> strings = magicalListGetter(String.class);
 */

public class MagicalListGetterFactory {
	String testString = new String("test");

	public <T> List<T> magicalListGetter(Class<T> klazz) {
		Object holder = null;
		
   	    List<T> list = new ArrayList<>(); // allocate memory
	    T actualType = null; 
	    Constructor<T> ctor = null;
	    
//	    klazz.isInstance(testString);
	    
	    try {
			// MIKE: Class.newInstance()  can be empty ()
			actualType = klazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
//	    holder = actualType;
	    
//	    holder = klazz.cast(holder);

	    if( actualType instanceof String){
  	    	System.out.println("Instance of String");	
	    }
	    if( actualType instanceof StringBuilder){
	    	StringBuilder temp = (StringBuilder)actualType; 
	    	temp.append("michael");
  	    	System.out.println("Instance of StringBuilder");	
	    }
	    else{
  	    	System.out.println("Instance of Unknown");	
	    }
//	    StringBuilder mike = null; 
//	    mike.append(j)
//	    actualType.append("mike");
	    

	    
	    /*
	     *  get Constructor
	     */
  	    if( actualType == null){
  	        try {
    			ctor = klazz.getConstructor( klazz );
	    		// MIKE: newInstance(Object.. initArgs)  cannot be empty ()
		    	actualType = ctor.newInstance("mike");

    		} catch (Exception e1) {  
	    		e1.printStackTrace();
    		}
  	    }
  	    else{
  	    	System.out.println("Default constructor was created.");	
  	    }
    	list.add(actualType);
	    

	    return list;
	}
    
    public static void main(String[] args) {

    	List<?> theList = null; 

    	MagicalListGetterFactory theFactory = new MagicalListGetterFactory();
    	
    	theList = theFactory.magicalListGetter( StringBuilder.class );

		System.out.println("sizeOf theList = " + theList.size());	

		System.out.println( theList );	

		System.out.println("sizeOf theList = " + theList.get(0));	

	    if( theList.get(0) instanceof StringBuilder){
  	    	System.out.println("Instance of StringBuilder");	
	    }

		

/*
		Object obj = null;
		obj = new String("mike");

		if ( obj instanceof String)
			System.out.println("obj is a String");	
			*/


	}
}
	
	
	

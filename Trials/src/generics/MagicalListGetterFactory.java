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

	public <T> List<T> magicalListGetter(Class<T> klazz) {
   	    List<T> list = new ArrayList<>(); // allocate memory
	    T actualType = null; 
	   
	    Constructor<T> ctor = null;
	    
	    try {
			// MIKE: Class.newInstance()  can be empty ()
			actualType = klazz.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    actualType = klazz.cast(actualType);
	    

  	    list.add(actualType);
	    
	    /*
	     *  get Constructor
	     */
  	    if( actualType == null){
  	        try {
    			ctor = klazz.getConstructor( klazz );
	    		// MIKE: newInstance(Object.. initArgs)  cannot be empty ()
		    	actualType = ctor.newInstance("mike");
		    	list.add(actualType);

    		} catch (Exception e1) {  
	    		e1.printStackTrace();
    		}
  	    }
  	    else{
  	    	System.out.println("Default constructor was created.");	
  	    }
	    

	    return list;
	}
    
    public static void main(String[] args) {

    	List<?> theList = null; 

    	MagicalListGetterFactory theFactory = new MagicalListGetterFactory();

    	theList = theFactory.magicalListGetter( String.class );
//    	theList = theFactory.magicalListGetter( StringBuilder.class );
//    	theList = theFactory.magicalListGetter( Integer.class );

		System.out.println("sizeOf theList = " + theList.size());	

		System.out.println( theList );	
	}
}
	
	
	

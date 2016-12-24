package generics;
import java.lang.reflect.Constructor;
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

    @SuppressWarnings("rawtypes")
	public <T> List<T> magicalListGetter(Class<T> klazz) {
//	    Object actuallyT = new String("mike");
	    Object actuallyT = null; 
	    Object actuallyT2 = new Object(); 
	    
   	    List<T> list = new ArrayList<>();

   	    actuallyT = klazz.cast(actuallyT);

	    System.out.println("actuallyT =" + actuallyT );	

   	    list.add(klazz.cast(actuallyT));


   	    try {
   	    	    // If default constructor
   	        list.add(klazz.getConstructor().newInstance()); 
   	    	Constructor<T> ctor = klazz.getConstructor();

   	    	System.out.println("ctor name" + ctor.getName());

//  	    	actuallyT = ctor.newInstance(klazz);
   	       actuallyT2 = klazz.newInstance();
   	    	System.out.println("actuallyT2 =" + actuallyT2 );	
   	    } 
   	    catch( Exception e){
   	    	e.printStackTrace();
   	    }
    	
	    String cName = klazz.getCanonicalName();	
	    System.out.println("name =" + cName );	

//	    	unknown = Class.forName(klazz.getCanonicalName());

//	    	placeholder = klazz.newInstance();

/*	    if( placeholder instanceof Integer ){
			System.out.println("Integer");	
	    }
	    else{
			System.out.println("not an Integer");	
	    }
*/

	    return list;
	}
    
    public static void main(String[] args) {

    	MagicalListGetterFactory theFactory = new MagicalListGetterFactory();

    	Integer theInt = new Integer( 8 );

    	List<String> theList = null; 
    	
//    	Class<Integer> intBluePrint = Integer.class;

    	
 //   	if (intBluePrint instanceof Class )
  //  		System.out.println( "Instance of Class\n" );	


 //   	theList = theFactory.magicalListGetter(theInt.getClass() );

    	theList = theFactory.magicalListGetter( String.class );

		System.out.println(theList.size());	

		System.out.println( theList );	

	}
}
	
	
	

package generics;
import java.util.ArrayList;
import java.util.List;

public class MagicalListGetterFactory {

	// MIKE case: This is a better approch because  
	//   	you generally don't want to return <?> when dealing with generics. 
	
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
    
}
			
	
	
	
	
}

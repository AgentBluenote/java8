package drivers;

import java.util.Date;
import java.util.Locale;

public class ContextResolver{   //implements CityLaw {

	public ContextResolver() {

	}

	public void ContextResolver1() {
	}

//	public void queryCityLegislation( String zipcode ){
//	}


	public static void main( String[] args ){
		
		    TimeServer timeInstance = new TimeServer();  
		    Locale locale = Locale.getDefault();
		    
		   //LevelOnePropriatary HotSwap(); 

		    System.out.println( locale.getLanguage());

		    long ourDate = System.currentTimeMillis();
	        Date date = new Date(ourDate);
	}
}

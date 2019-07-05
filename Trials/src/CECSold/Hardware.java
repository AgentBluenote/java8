package CECSold;

import java.util.*;


public final class Hardware {
	// 80X86x  or MIPS  Only two right now. 
	private String chipSet = new String("IBM PC 80x86 family");  

    public Hardware(){
    }

    public String getChipSet(){
//    	String ret_Val = new String();
//    	ret_Val = chipSet;
 //   	return ret_Val;
    	return chipSet;   // MIKE: what is the proper way.
                          // possible violation of encapsulation.
    }

    public void setChipset( String in_chipset ){
	  chipSet = in_chipset; 
    }

    
    
    //
    // this is my pick up line when I bust them  
    // I bust them so I can give themm a better deal than the one 
    // the cops gave them. 
    //
    // Ohh, I think you know what a "chip set" is.
    //
    public String giveUpChipSet(){  // "because I sed"  MA
    	return chipSet;
    }
}



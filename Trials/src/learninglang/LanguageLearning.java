package learninglang;
import java.lang.System;

public class LanguageLearning {

	public LanguageLearning() {
		// defualt constructor
	}

	public LanguageLearning(String classname) {

		System.out.println(classname);
	}
	
	public void testMaxValueOfInteger(){
		@SuppressWarnings("unused")
	    int maxInt = 2147483647;	

		System.out.println("\n** Inside testMaxValueOfInteger\n");
		
		System.out.println("Integer max = " + Integer.MAX_VALUE);
		System.out.println("Integer max = " + Integer.MIN_VALUE);
		
		/*
		 *  MIKE TEST RESULTS:  
		 *
		 *  maximun value an int can hold is 2**31  
		 *  java uses one of the 32 bits as a sign bit
	 	 */
		
	}

	public void labeledBreaktest(){
		
		int[][] arrayOfInts = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;
	        
		System.out.println("\n** Inside labeledBreaktest\n");

	    //  MIKE:  labels allow you to exit more than one logical block    
	    search:
	        for (i = 0; i < arrayOfInts.length; i++) {
	            for (j = 0; j < arrayOfInts[i].length;
	                 j++) {
	                if (arrayOfInts[i][j] == searchfor) {
	                    foundIt = true;
	                    break search;
	                }
	            }
	        }

	        if (foundIt) {
	            System.out.println("Found " + searchfor + " at " + i + ", " + j);
	        } else {
	            System.out.println(searchfor + " not in the array");
	        }
	}
	
	// random block of code to to Constructors
    {
         System.out.println("Some Constructor is being Called");
         System.out.println("This block be called by every constructor..");
    }




	public static void main(String[] args) {
		LanguageLearning driver = new LanguageLearning(); 
		LanguageLearning driver2 = new LanguageLearning("LanguageLearning"); 

		driver.testMaxValueOfInteger();
		
		// illistates labeled break
		// continue works with labels as well 
		driver.labeledBreaktest();
		
	}  // end of main()
	
	
}

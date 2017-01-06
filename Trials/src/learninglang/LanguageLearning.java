package learninglang;
import java.lang.System;

public class LanguageLearning {

	public LanguageLearning() {
		// defualt constructor
	}
	
	public static void test1(){
	    int maxInt = 2147483647;	
		
		System.out.println("Integer max = " + Integer.MAX_VALUE);
		System.out.println("Integer max = " + Integer.MIN_VALUE);

	
	}

	public static void labeledBreaktest(){
		
		int[][] arrayOfInts = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        };
	        int searchfor = 12;

	        int i;
	        int j = 0;
	        boolean foundIt = false;
	        
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

	public static void main(String[] args) {

		LanguageLearning.test1();
		
		// illistates labeled break
		// continue works with labels as well 
		LanguageLearning.labeledBreaktest();
		
	}

}

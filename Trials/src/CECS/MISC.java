package CECS;

import java.lang.Math;

public class MISC {

		public static void flexAlert( int hops ){

		}

		public static void mortgaugePayment( int purchase_price ){
		}

		public static void mnRule( int base, int positions ){
			double result;
			
			result = Math.pow( base, positions );
			
			System.out.println("BASE: " + base + " POSITIONS: " + positions + "\nCombinations: " + result );
		}
		
		 //
	    // main()
	    //
		public static void main(String[] args) {

			MISC.mnRule(2, 8 );
		
			
			// To send One package:
		}		
		
		
		

}


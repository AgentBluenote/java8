package CECS;
//package dictionary;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;


/*
 *  When an IRAD is established which is basically a Legislative ACT 
 *  in which a company takes on to learn more  about a subject: 
 *  
 *  The term Subject can mean many things.  It can even mean doing 
 *  research on a persons background and family as to make sure
 *  they are not in America to become a "free citizen" as opposed  
 *  as surreptiouly working with a foreign government.
 * 
 *  Basically they don't know who the person it for whatever reason 
 *  Sometimes it is the case that the subject being researched   
 *  is found to be at a higher echelon than the company performing
 *  the background inverstigation. 
 *  There is a protocol put in place on the fairly rare case in which this happens. 
 *  This is a very sensitive subject.    
 *  
 *  Basically nobody can verify the persons Identity.   
 *  If the person gets a bank account in which the institution signs off on.  
 *  
 *  ( This account can NOT be turned off.
 *     
 *  ( For this reason, the Direct Deposit payments
 *    continue even after the person has left the company. 
 *     
 *  They Don't just drop everything and quick trying to figure out who 
 *  this person is just because he/she moved on to other opportunities 
 *   
 *  Once again, there is protocol. 
 *   
 *  I have Direct Deposit with "the Company" A.K.A "the Company" since November of 1999.  
 *  paid bi-montly the 1st and the 3rd Thursday of every month.  
 *  
 *  At the rate of $50,000.00 Annually U.S.D effective date November 1999. 
 *  At  
 *  At the rate of $78,360.00 Annually U.S.D effective date November 2008. 
 *  
 *  
*/
class FinancialInstitution extends Observable{

    public int DAY_OF_MONTH = 0; 

    // the Rounting number starts with either 0 or 1 
    // one is for transfer into the bank. 
    // the other is for withdrawsout ofthe ban. 


    private String m_routing_number = new String(  "122000661 ");
    private String m_check_number   = new String( "0383 ");
    private String m_account_number = new String( "10273-76628") ;
    private String m_institution    = new String( "Bank of America") ;

    private	FileProcessing m_NVRAM = new FileProcessing();

//    private Calendar m_calendar = m_clock.getTimeStamp(); 

    private BigDecimal m_balance = new BigDecimal("900.00");

	private float ice; 

//    private DirectDeposit dd = null; 
//    Fully Quailified: look like this  "122000661-0383-10273-76628";


    //
    //public FinancialInstitution( Calendar seed ){
    //
    public FinancialInstitution() {
       // Home Loans.
       // Investment Oppertunities 
       //  a. CD's ( Certificate of Divorce ) 
       // Bank's  
       // Direct Deposit //
    }

    // 
    //  method name: 
    //     
    //     store info in some Database. 
    public void write_to_NVRAM( ){
        System.out.println( "write_to_NVRAM"   );
    	
    // 1992 CitiBank  ( 5 years because CMS 05 requrirment was not met. $27.01 )
    //        
    // 1999 Bank Of America 
    //
  	// 2001 Prudential ( Joint Account; Business Account: 3 people )  
    //
    // 2012 Bank Of America ( Myrtle Beach South Carlolina ) 
    //
    // 2012 Union Bank  

    // 2018 Wells Fargo ( SSDI only ) 	
    //      On the 3rd. 
    	
       // NGC      $4000.00/month   1st and 3rd Thurs.  

       // UNUM     $4200.00/month
       // RSystems ( $48.00/hour @ 40 )  + 10
       // Edison   ( $50.00/hour @ 40 )  
       // GE       ( $120,000.00 )  
       // SSDI     ( $2040.00  ) 
       // 
       // Original Medicare  ( -$111.00/month )  a Federally Funded Project!
    }

    // 
    // method name:
    // NGC transfers
    //
    public void direct_deposit_NGC( int dayOfWeek ){
    	BigDecimal ngc_paystub = null; 

    	switch( dayOfWeek ){

    	    case Calendar.MONDAY:	

    	    	break;

    	    case 1: 
                // My paycheck after taxes. 
    	        ngc_paystub = new BigDecimal( "1973.69");

                System.out.println( "Before Deposit                    : "  
                                       + "$" +  m_balance.toString() );

    	    	System.out.println( "Northrop Grumman Corp. Deposit of : " + "$" + 
                                       ngc_paystub.toString());

                m_balance = m_balance.add( ngc_paystub ); // getting paid. 

                System.out.println( "After checkBalance                : " + "$" + 
                                    m_balance.toString() );

                System.out.println( "Inside " + ngc_paystub.floatValue() );  

                System.out.println( "Inside " + ngc_paystub.floatValue() );  

//    	     BigDecimal ngc_paystub = new BigDecimal( "1973.00");

    	    	this.notifyObservers(); 

                break;

    	    case 15:  


    	    	break;

    	}  // end of switch
    } 

    //
    //
    // method name: 10th and 25th 
    //
    public void direct_deposit_volt( int dayOfMonth ){

    	switch( dayOfMonth ){

    	    case 10: 
    
    	    	System.out.println("Rsystems deposit of : $2,700.00");

    	    	this.notifyObservers(); //  

    	    	break;

    	    case 25:  
    	    	System.out.println("Rsystems deposit of : $2,700.00");

    	    	this.notifyObservers(); //  

    	    	break;

    	    default:  
    	    	System.out.println("DEFAULT: it's not the 10th or 25th");
    	}  // end of switch
    } 

    
    // 
    // method signiture 
    // 
    public void getFreshFlyThreads ( ){

    	MyThread miked = new MyThread("PDT");
    	MyThread mikee = new MyThread("GMT");  // Gennich Mean Time.

    	miked.start();
    }

    // 
    // method signiture 
    // 
//    public void getFreshFlyThreads2 ( ){
    public void check_balance ( ){
    	ice = 0; 

    	MyThread miked = new MyThread("PDT");
    	MyThread mikee = new MyThread("GMT");  // Gennich Mean Time.

    	miked.start();
    }

    // 
    // method name: 
    // 
    public void triggerTime ( ){
    	MyThread miked  = new MyThread("Tcat");

    	miked.start();
    }

    //
    // main()
    // 
    public static void main( String[] argv){

       Student              Ariana  = new KeptWomenStudent();
       FinancialInstitution wells   = new FinancialInstitution();
       
       wells.write_to_NVRAM();


   	   FileProcessing nvram = new FileProcessing();

//    	nvram.setInFilePath(inFile);
 //   	nvram.setInFilePath(outFile);
    	

       Ariana.updateFinancialInstitution( wells );

       Ariana.what_do_we_do();
       
//       wells.direct_deposit_volt(10);
//       wells.direct_deposit_volt(25);

       wells.direct_deposit_NGC(15 );   
       wells.direct_deposit_NGC(1 );   
    } 

}   // end of FinancialInstitution







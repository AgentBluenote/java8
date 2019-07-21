package CECS;
//package dictionary;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;


class Bank extends FinancialInstitution{

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
    public Bank() {
       // Home Loans.
       // Investment Oppertunities 
       //  a. CD's ( Certificate of Divorce ) 
       // Bank's  
       // Direct Deposit //
    }

    //
    //
    //
       // Home Loans.
       // Investment Oppertunities 
       //  a. CD's ( Certificate of Divorce ) 
       // Bank's  
       // Direct Deposit //
    public Bank( String last_four ) {
//        if( last_four ==  "6661" )
 //           account_number = new String( "10273-76628") ;  // BofA
  //      else 
   //         account_number = new String( "10273-76628") ;  // Wells Fargo
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







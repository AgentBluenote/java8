package CECS;

import java.util.*;

public final class BankAccountFactory {

    // 
    // default Constructor
    // 
    public BankAccountFactory(){
    }

    //
    //
    //
    public static FinancialInstitution getBankAccount( String ss_number ){

        FinancialInstitution m_usbank  =  new Bank(); 

    	switch ( ss_number ){   // we know the name of the student

    	    case "8118":
               System.out.println("Criminal Name:  Dennis Volper" );

               //m_usbank  =  new Bank( "8118" );
               m_usbank  =  new Bank( );

   	           break;

    	    case "3855":
               System.out.println("Criminal Name:  Miss M. Ariana" );
//               m_usbank  =  new Bank( "3855" );
               m_usbank  =  new Bank();


    	    default:
                System.out.println("default case: " );

    	} // end switch

        return m_usbank;
    }

    //
    // main()
    //
    public static void main(String[] args) {
      
//        FinancialInstitution usbank = new Bank();

 //       usbank = usbank.getBankAccount("8818");


    }
}



package CECS;

import java.util.*;

class MyThread extends Thread {

    private String thread_name                          = null;
    private Vector<FinancialInstitution> m_federal_bank = new Vector<FinancialInstitution>();

    // private Vector<String> vec = new Vector<String>();

    //
    // Constructor I:
    /////
    public MyThread( String thread_name, FinancialInstitution  fi ){
  
          thread_name           =  thread_name;
          m_federal_bank.add(fi);
    }

    //
    // Constructor II:
    //
    public MyThread( String st_name ){
        thread_name = st_name;
    }

    // 
    // method name: 
    // 
    public void run(){
  
      try {
  
        for(;;){
          System.out.println(  thread_name);
          System.out.println("Do Some Work!");

//MIKE          this.activeCount();

          Thread.sleep(1000);
         
        }
  
      } catch(InterruptedException e) {
        System.out.println("sleep interrupted");      
      }
    } // end of run()
  
  //
  // method name:
  //
  public void getPreCannedTGroup(){

    MyThread t1 = new MyThread("First Thread");
    MyThread t2=  new MyThread("Second Thread");
    MyThread t3=  new MyThread("Thread Thread");
    

    FinancialInstitution jit = new FinancialInstitution();
    
//    vec.add( t1 );
 //   vec.add( t2 );

    int i=0;

    for( i= 0; 0 < 2 ; i++ ){
    }
	  
  }

  //
  // method name:
  //
  public static void main(String[] args) {
//    Vector v = new Vector();


    MyThread t1 = new MyThread("First Thread");
    MyThread t2 = new MyThread("First Thread");

    MyThread ffly = new MyThread("iii");

//       v.getPreCannedTGroup(); 

//    t1.start();
//    t2.start();
	  
  }
}

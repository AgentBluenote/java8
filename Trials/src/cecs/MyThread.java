
package cecs;

import java.util.*;

class MyThread extends Thread {

    private String m_thread_name                          = null;

    // private Vector<String> vec = new Vector<String>();


    //
    // Constructor I: 
    //
    public MyThread( String st_name ){
        m_thread_name = st_name;
    }

    //
    // Constructor II:
    //
    public MyThread( String m_thread_name, FinancialInstitution  fi ){
          m_thread_name =  m_thread_name;
    }

    // 
    // method name: 
    // 
    public void run(){
  
      try {
  
        for(;;){

          System.out.println(  m_thread_name );
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
    
//    FinancialInstitution jit = new FinancialInstitution();
    
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

//          System.out.println("Do Some Work!");

    MyThread t1 = new MyThread("First Thread");
    MyThread t2 = new MyThread("Second Thread");

    MyThread ffly = new MyThread("iii");
    
    

//       v.getPreCannedTGroup(); 

    t1.start();
    t2.start();
	  
  }
}

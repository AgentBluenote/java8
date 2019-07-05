package CECSold;

import java.util.*;


/*
 *  Algorithm to find . out who is "Ca-Hoots" with the "spin-master"
 *
 *  return next Application that gets loaded by OS.   
 *  dll's are pulled in @ runtime. 
 *  for the App to work all 31 dll must load and execute. 
 */
public final class JVMRunTime{
     
//    private  ArrayList<Application> pipeline = null; 

    private static  ArrayList<Application> pipeline = null; 
    private static int IP = 0;  // Instruction Pointer 


    JVMRunTime(){
        pipeline = new ArrayList<Application>();  
    	System.out.println( "It's not FREE, it's 100% paid for by your employer via \"prof sharing\"" );

    }

    public static Application requestDynamicLibrary(){  
        pipeline = new ArrayList<Application>();  

    	Application handle  = null;


        pipeline.add( new Application("~dvolper", "port( LOS_ANGELES)" ,"Safari License!" ) );
        handle = pipeline.get( IP );


    	IP++;

		return handle;
    }

    public static void RTTI(){
    	System.out.println( "JVMRuntime: Runtyie Type Information." );
    }

    public static void main(String[] args){

        OperatingSystem unknown = null;
        JVMRunTime rt = null;

        rt = new JVMRunTime(); 
        rt.requestDynamicLibrary();

    }
}


//	System.out.println( "It's not FREE, it's 100% paid for by your employer via "profit sharing" );





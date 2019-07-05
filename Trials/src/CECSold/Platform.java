package CECSold;

import java.util.*;


/*
 *  A platform is a combination of different components. 
 *  i.e.  SnapDragon Chipset 
 *        Android OS 
 *        HotSpot JVM  
 *        HTML5 
 *        
 *  i.e.  Sony DS Chipset  ( "DS stands for "Deep Shit" )
 *        Windows embedded ( Speed Kernal ) 
 *       .Net ( Run-Time ) 
 *        HTML5 
 */
public final class Platform {
	// 
	// base16
	// 
	public enum HexStack {
	    ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, A, B, C, D, E, F, 
	}

	private  HexStack        m_ArchType          =  HexStack.ZERO; 

	private  Hardware        m_architecture      =  new Hardware();
	private  OperatingSystem m_OSLayer           =  new OperatingSystem(); 
	private  JVMRunTime      m_HotSpot           =  new JVMRunTime(); 

	// 
	// default Constructor
	// 
    public Platform(){
    }

	// 
	// default Constructor
	// 
    public Platform( HexStack mux ){

    	switch (mux){
    	    case A:
    	    	m_ArchType = HexStack.A; 
    	        m_OSLayer = new OperatingSystem("Slackware Linux 2.0");
    	        break;


    	    case F:
    	    	m_ArchType = HexStack.F;
    	        m_OSLayer = new OperatingSystem("Windows embedded MV");
    	        break;
    	    default:
    	}
    }

    //
    //
    //
    public OperatingSystem getOSLayerReference(){
    	return this.m_OSLayer;
    }

    //
    //
    //
    public JVMRunTime getJVMHotSpot(){
    	return this.m_HotSpot;
    }


    //
    //
    //
    private void printPlatformStack( Platform in_plat ){
    	String temp = new String( );

        System.out.println("Hardware        : " + this.m_architecture.getChipSet()      );
        System.out.println("OperatingSystem : " + this.m_OSLayer.getOS() );
        this.m_HotSpot.RTTI();
        System.out.println("Executable      : " ); 
    }

    //
    // main()
    //
	public static void main(String[] args) {
		String [][] m_preCanned = { 
                {"Michael", "~marcham"   , "Apache 2.0"}, // Our answer to *this. 
                {"Michael", "~mgines " , "GPL"} ,         // puts the G in that license agreement. 
                {"Michael", "~dmolina ", "CSULB"} ,       // I am the COO of Health Care.
                                                          // Chief Operation Officer. 
                {"Michael", "~jkim_esq ", "WITH_SWEET_T; USE_SWEET_T"} }; 
	
		
    	HexStack combo= HexStack.F;  // F is good,  CRIL sed "F is four HI; A.K.A 1111" 

        Platform         platformStack = new Platform( HexStack.A );
        OperatingSystem  theOS_handle  = new OperatingSystem(); 
        JVMRunTime       runtime       = new JVMRunTime(); 
        Application      app           = new Application( m_preCanned[0] );
           

   	    platformStack.printPlatformStack(platformStack);
   	    platformStack.getJVMHotSpot();

        runtime.requestDynamicLibrary();

        theOS_handle.loadApp(app);


	}
}


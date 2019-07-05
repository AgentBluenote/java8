package CECSold;

import java.util.*;
import java.io.*;

public final class OperatingSystem {

        
        

//        private SixSigmaISO9001 class_174 = new Application( m_preCanned[0] ); 

        private String m_OperatingSys   = new String("BSD Linux" ); 
        private String m_MAC_802_11ac   = "MAC-10"; // this has to do with "context" 
                                                // if whoever is tasked with this *field 
                                                // fails 
                                                // no memory allocated on the heap. 

                                                // if (u tri 2 access memory ) 
                                                //  
                                                // triggers auto-drive-by. 

        //
        // Constructor: defualt
        //
        public OperatingSystem(){
        }

        // 
        // Constructor II
        // 
        public OperatingSystem( String os  ){
           this.m_OperatingSys = os;	
        }

        // 
        // 
        // 
        public void setOS( String os){  
           this.m_OperatingSys = os;
        }

        // 
        // 
        // 
        public String getOS(){  

        // String retValue = null; 
        // retValue = new String( m_OperatingSys );
        // return retValue; 
           return m_OperatingSys;
        }

        public void isApplicationLoadable(){
//        	Application.isLoadable
        }

        // 
        //  loadApp 
        // 
        public void loadApp( Application app ){

        	OSGIServices classProject_Masters = app;
        	
        	classProject_Masters.get_Name();
        	classProject_Masters.get_HomeDirectory();
        	
        }
}

	



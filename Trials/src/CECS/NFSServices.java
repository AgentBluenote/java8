package CECS;

import java.lang.*;
import java.util.*;

//  
//  Map sutdents/share ~home directory to any computer on campus.
// 
public interface NFSServices{

//    public void queryCityLegislation( String zipcode );

   public String getName();
   public void setName( String name );

   public String getSSNumber();
   public void setSSNumber( String ss_number );

   

   public String getHomeDirectory();      // get 
//   public void setHomeDirectory();      // set   not implmented yet MIKE

   public String getLicenseAgreement();   // get 
//   public void setgLicenseAgreement();   // set   not implmented yet MIKE
}

package annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import annotations.PreambleAnnotation;
import annotations.Schedule;
import annotations.ScheduleContainer;

@PreambleAnnotation (
		   author = "Michael A Doe",
		   email =   "michaeldoe@yahoo.com"
		   )
public class CronTab{

        public CronTab(){
        	System.out.println("Inside CronTab: Constructor\n");
        }
        
        @Schedule(dayOfMonth="last")
        @Schedule(dayOfWeek="Fri", hour="23")
        public void scheduleCronJob() { 
    		Method method = null;

    		System.out.println("** Inside scheduleCronJob()\n");
    		
    		/*
    		 * get class instance. 
    		 */
    		Class<CronTab> this_class = CronTab.class;
    		
    		/*
    		 *  Pull out annotated method because @Schedule is defined at 
    		 *  method level.  @Target(ElementType.METHOD)    
    		 */
    		try {                
    	        method = this_class.getMethod("scheduleCronJob");  
    	        System.out.println("OBJECT: method = " + method.toString());        
    	     }
    	     catch(NoSuchMethodException e) {
    	         System.out.println("** method not found\n");
    	         System.out.println(e.toString());
    	     }

    		/*
    		 *  get annotations from Method object. 
    		 *  When annotation is marked @Repeatable the Conntainer annotation 
    		 *  is returned. 
    		 */
    		Annotation[] annotations = method.getDeclaredAnnotations();

            System.out.println("OBJECT[]: annotations.length = " 
      							+ annotations.length +
            					" indicated that an \"Annotation Container\" was returned" );

    		for(Annotation element : annotations){
    			/*
    			 *   Need to check for Container annotation for @Schedule 
    			 *   because it is marked as @Repeatable.  
    			 */
    		    if(element instanceof ScheduleContainer){
    		        System.out.println(
    		        		"@ScheduleContainer found: lets pull out meta-data... ");
    		        	System.out.println("");

    		        ScheduleContainer anno_ScheduleContainer = 
    		        		(ScheduleContainer)element;

      			   /*
    			    *   pull values out of the container 
    			    */
    		        Schedule[] value_ScheduleContainer = anno_ScheduleContainer.value(); 

    		        System.out.println("OBJECT: value_ScheduleContainer.length: " + 
    		        					value_ScheduleContainer.length );

      			   /*
    			    *   pull values out of the container 
    			    */
    		        for(Schedule index : value_ScheduleContainer){
    		        	Schedule Schedule_element = (Schedule)index;

    		        	System.out.println("OBJECT: Schedule_element.dayOfMonth(): " + Schedule_element.dayOfMonth() );
    		        	System.out.println("OBJECT: Schedule_element:dayOfWeek() " + Schedule_element.dayOfWeek() );
    		        	System.out.println("OBJECT: Schedule_element:hour() " + Schedule_element.hour() );
    		        	System.out.println("");
    		        }
    		    }
    		}
    	}
        /**
    	 * @deprecated
    	 * I dinn't really like this method so I took the liberty to make is 
    	 * deprecated. 
    	 */
        @Deprecated
    	public void scheduleAtJob() {
    		System.out.println("** Inside is scheduleAtJob()\n");
    		System.out.println(
    				"This method illistrates @Deprecated meta-annotation");
    		System.out.println(
    				"    See docs directory after Project--> Generate Javadoc\n");
    	}
    }	
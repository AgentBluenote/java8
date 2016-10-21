package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
/*	For compatibility reasons, repeating annotations are stored 
/*	in a container annotation that is automatically generated 
 *	by the Java compiler. 
 *
 *  In this case the the container annotation is @Schedules
 */
@Repeatable(ScheduleContainer.class) 
@Retention(RetentionPolicy.RUNTIME)// default Retention is RetentionPolicy.CLASS)  
@Target(ElementType.METHOD) 
public @interface Schedule{
  String dayOfMonth() default "first";
  String dayOfWeek() default "Mon";
  String hour() default "12";
}


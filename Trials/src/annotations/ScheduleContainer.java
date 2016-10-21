package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
/*	For compatibility reasons, repeating annotations are stored 
/*	in a container annotation that is automatically generated 
 *	by the Java compiler. 
 *
 *  this is the container annotation for @Schedule
 */

@Documented
@Target(ElementType.METHOD) 
@Retention(RetentionPolicy.RUNTIME) // default Retention is RetentionPolicy.CLASS) 
public @interface ScheduleContainer {
    Schedule[] value();
}

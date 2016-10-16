package annotations;

import java.lang.annotation.Repeatable;

/*
/*	For compatibility reasons, repeating annotations are stored 
/*	in a container annotation that is automatically generated 
 *	by the Java compiler. 
 *
 *  In this case the the container annotation is @Schedules
 */
@Repeatable(Schedules.class) 
public @interface Schedule {
  String dayOfMonth() default "first";
  String dayOfWeek() default "Mon";
  int hour() default 12;
}


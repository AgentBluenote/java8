package junit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   /* 
    * MIKE:The Test annotation tells JUnit that the public void 
    * method to which it is attached can be run as a test case
    */
   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}


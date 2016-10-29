package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import drivers.Java8Driver;
import junit.framework.Assert;

public class Java8Driver_test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * I love CSULB TESST
	 */
	@Test
	public void test() {
		Java8Driver tdriver = new Java8Driver();
	    tdriver.iLoveCSULB();
	    
//	    @SuppressWarning("unchecked") 
	    Assert.assertEquals("I lover CSULB", tdriver.iLoveCSULB()); 
		
		
//		fail("Not yet implemented");
	}

}

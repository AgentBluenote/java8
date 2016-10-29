package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import drivers.Java8Driver;
import generics.FindListMax;

public class TestSuite {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@RunWith(Suite.class)
	@SuiteClasses({
	                Java8Driver.class,
	                FindListMax.class })

	public class AllTests {

	}

}

package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;
import generics.FindListMax;

public class FindListMaxTest {

	@Test
	public void testFindMaxelement() {
		Integer maxReturn = null;
		
		List<Integer> integerList = new ArrayList<>();

		integerList.add(1);
		integerList.add(3);
		integerList.add(7);
		integerList.add(44);

        maxReturn = FindListMax.findMaxelement(integerList, 0, 3);
       
        Assert.assertEquals( maxReturn, new Integer(7));

        System.out.println("maxReturn for Integer = " + maxReturn);



//		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
//		fail("Not yet implemented");
	}
}



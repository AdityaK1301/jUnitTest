package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		int result=Junit.AddNumbers(100, 200);
		assertEquals (300,result);
	}

}

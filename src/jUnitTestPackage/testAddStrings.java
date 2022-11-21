package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		String result=Junit.AddStrings("Aditya", "Kumar");
		assertEquals ("AdityaKumar",result);
	}

}

package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_Assertion {

	@Test
	public void assertTests() {
		
		String str = null;
		String str1 = "Simplilearn";
		
		Assertions.assertNull(str);
		Assertions.assertNotNull(str1);
		
		Assertions.assertTrue(5>4);
		Assertions.assertFalse(4>5);
		
		Assertions.assertSame(str, str);
		Assertions.assertNotSame(str1, str);
	
		String[] a1 = {"A","B"};
		String[] a2 = {"A","B"};
		
		Assertions.assertArrayEquals(a1, a2);
	}
	
	
}

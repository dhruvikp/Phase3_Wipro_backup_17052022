package com.simplilearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class D_NestedTest {

	@BeforeEach
	public void initEach() {
		System.out.println("Before Each From Outer class");
	}
	
	@Nested
	class A {
	
		@BeforeEach
		public void initEachInner() {
			System.out.println("Before Each From Inner class");
		}
		
		@Test
		public void test() {
			System.out.println("Test executed from nested class");
		}
	}
	
}

package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
public class A_TestLifeCycleMethods {

	@BeforeAll
	static void intAll() {
		System.out.println("Before All initAll()");
	}
	
	@BeforeEach
	void init() {
		System.out.println("Before Each Test");
	}
	
	@Test
	void successTest1() {
		System.out.println("Successing test");
	}
	
	@Test
	void successTest2() {
		System.out.println("Successing test222");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("After executing Each Test");
	}
	
	@AfterAll
	static void tearDownAll() {
		System.out.println("After All TearDownAll()...");
	}
	
}

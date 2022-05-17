package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.simplilearn.Phase3_Wipro_May_Backup.Calculator;

@RunWith(JUnitPlatform.class)
public class E_RepeatedTestDemo {

	@BeforeEach
	void initEach() {
		System.out.println("BeforeEach");
	}
	
	@Test
	@RepeatedTest(1000)
	void testCalculate() {
		Calculator c = new Calculator();
		Assertions.assertEquals(6, c.calculate(3, 3));
	}
}

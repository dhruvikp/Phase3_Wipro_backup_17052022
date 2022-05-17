package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.simplilearn.Phase3_Wipro_May_Backup.Calculator;

@RunWith(JUnitPlatform.class)
@DisplayName("CalculateTest")
public class C_CalculatorTest {

	Calculator c;
	
	@BeforeEach
	public void intEach() {
		c = new Calculator();
	}
	
	@Test
	@DisplayName("Test Additon calculation")
	public void testAdditionCalculate() {
		Calculator c = new Calculator();
		// Step 1: Collect input
		int a = 3;
		int b = 3;
		
		// Step 2: Invoke actual method and get actualValue
		int actualValue = c.calculate(a, b);
		
		// Step 3: Assert expecations.
		Assertions.assertEquals(6, actualValue);
	}
}

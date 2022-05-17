package com.simplilearn;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class G_DynamicDemo {

	@TestFactory
	Collection<DynamicTest> dynamicTests() {

		return Arrays.asList(DynamicTest.dynamicTest("Simple dynamic Test1", () -> {
			Assertions.assertTrue(true);
		}), DynamicTest.dynamicTest("Simple dynamic Test2", () -> {
			Assertions.assertTrue(true);
		}),

				DynamicTest.dynamicTest("Simple dynamic Test3", () -> {
					Assertions.assertTrue(true);
				}));
	}
}

package com.example.springtest.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestControllerTest {

	/**
	 * 单元测试，可以通过 setter 方法注入依赖
	 */
	@Test
	public void testUnitTestController() {
		UnitTestController unitTestController = new UnitTestController();
		UnitTestService unitTestService = new UnitTestService();
		unitTestController.setUnitTestService(unitTestService);
		String result = unitTestController.testController();
		assertEquals("unitTest", result);
	}

}
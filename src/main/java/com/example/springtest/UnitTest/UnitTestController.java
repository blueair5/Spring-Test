package com.example.springtest.UnitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitTestController {
	private UnitTestService unitTestService;

	@Autowired
	public void setUnitTestService(UnitTestService unitTestService) {
		this.unitTestService = unitTestService;
	}

	@RequestMapping("/testController")
	public String testController() {
		return unitTestService.getTest();
	}
}

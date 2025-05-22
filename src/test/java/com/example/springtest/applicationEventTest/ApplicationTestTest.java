package com.example.springtest.applicationEventTest;

import com.example.springtest.applicationEventTest.common.event.BillOverEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTestTest {
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	@Test
	public void testPublishEvent() {
		// 模拟单据审批结束
		System.out.println("单据审批完成了");
		// 发布事件, 模拟事件接收
		eventPublisher.publishEvent(new BillOverEvent(applicationContext, "007"));
	}

}
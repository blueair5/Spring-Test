package com.example.springtest.applicationEventTest;

import com.example.springtest.applicationEventTest.common.event.BillOverEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * spring 事件测试
 */
@Service
public class ApplicationTest {
	private final ApplicationEventPublisher applicationEventPublisher;

	private final ApplicationContext applicationContext;

	public ApplicationTest(ApplicationEventPublisher applicationEventPublisher, ApplicationContext applicationContext) {
		this.applicationEventPublisher = applicationEventPublisher;
		this.applicationContext = applicationContext;
	}

	public void publishEvent() {
		// 模拟单据审批结束
		System.out.println("单据审批完成了");
		// 发布事件, 模拟事件接收
		applicationEventPublisher.publishEvent(new BillOverEvent(applicationContext, "007"));
	}
}

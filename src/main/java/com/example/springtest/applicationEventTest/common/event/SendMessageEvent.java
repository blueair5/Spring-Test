package com.example.springtest.applicationEventTest.common.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SendMessageEvent implements ApplicationListener<BillOverEvent> {
	@Override
	public void onApplicationEvent(BillOverEvent event) {
		System.out.println("我收到了单据" + event.getBillId());
	}
}

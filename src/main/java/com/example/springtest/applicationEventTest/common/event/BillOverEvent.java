package com.example.springtest.applicationEventTest.common.event;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class BillOverEvent extends ApplicationContextEvent {
	private String billId;
	public BillOverEvent(ApplicationContext source, String billId) {
		super(source);
		this.billId = billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillId() {
		return billId;
	}
}

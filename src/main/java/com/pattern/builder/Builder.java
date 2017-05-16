package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.pattern.abstractfactory.MailSender;
import com.pattern.abstractfactory.Sender;
import com.pattern.abstractfactory.SmsSender;

public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}

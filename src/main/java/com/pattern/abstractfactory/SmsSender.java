package com.pattern.abstractfactory;

public class SmsSender implements Sender {

	public void Send() {
		System.out.println("this is SMS Sender!!!");
	}

}

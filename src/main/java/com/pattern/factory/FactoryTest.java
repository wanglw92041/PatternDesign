package com.pattern.factory;

public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceSms();
		sender.send();
	}
}

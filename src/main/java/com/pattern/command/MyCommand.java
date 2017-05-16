package com.pattern.command;

public class MyCommand implements Command {

	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	public void exe() {
		receiver.action();
	}

}

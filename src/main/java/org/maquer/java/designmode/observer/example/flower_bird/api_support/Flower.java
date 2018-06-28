package org.maquer.java.designmode.observer.example.flower_bird.api_support;

import java.util.Observable;

public class Flower extends Observable {

	private boolean state;
	public static final boolean STATE_OPEN = true;
	public static final boolean STATE_CLOSE = false;

	public void open() {
		System.out.println("花开啦~");
		this.state = STATE_OPEN;
		this.changeState(this.state);
	}

	public void close() {
		System.out.println("花睡觉啦~");
		this.state = STATE_CLOSE;
		this.changeState(this.state);
	}

	private void changeState(boolean state) {
		super.setChanged();
		super.notifyObservers(state);
	}
}

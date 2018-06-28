package org.maquer.java.designmode.observer.example.flower_bird.api_support;

import java.util.Observable;
import java.util.Observer;

public class Bird implements Observer {

	private String name;

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		boolean state = (boolean) arg;
		if (state == Flower.STATE_OPEN) {
			this.pick();
		} else if (state == Flower.STATE_CLOSE) {
			this.gohome();
		}
	}

	public void pick() {
		System.out.println("蜂鸟" + this.name + "采花");
	}

	public void gohome() {
		System.out.println("蜂鸟" + this.name + "回家");
	}
}

package org.maquer.java.designmode.observer.example.flower_bird;

import org.maquer.java.designmode.observer.base.Event;
import org.maquer.java.designmode.observer.base.Observer;

public class Bird implements Observer{

	private String name;

	public Bird(String name) {
		super();
		this.name = name;
	}

	public void pick() {
		System.out.println("蜂鸟" + this.name + "采花");
	}

	public void gohome() {
		System.out.println("蜂鸟" + this.name + "回家");
	}

	@Override
	public void handleEvent(Event e) {
		if (e instanceof FlowerStateChangeEvent) {
			FlowerStateChangeEvent event = (FlowerStateChangeEvent) e;
			if (event.isOpen()) {
				this.pick();
			} else {
				this.gohome();
			}
		}
	}

}

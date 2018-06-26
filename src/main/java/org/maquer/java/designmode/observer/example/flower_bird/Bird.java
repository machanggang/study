package org.maquer.java.designmode.observer.example.flower_bird;

import org.maquer.java.designmode.observer.base.Event;
import org.maquer.java.designmode.observer.base.Observer;

public class Bird implements Observer{

	private String name;

	public void pick() {
		System.out.println("蜂鸟" + this.name + "采花");
	}

	public void gohome() {
		System.out.println("蜂鸟" + this.name + "回家");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void handleEvent(Event e) {
		
	}

}

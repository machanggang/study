package org.maquer.java.designmode.observer.example.flower_bird;

import org.maquer.java.designmode.observer.base.Event;

public class FlowerOpenEvent extends Event {
	private static final long serialVersionUID = 1L;

	public FlowerOpenEvent(Object source) {
		super(source);
	}

}

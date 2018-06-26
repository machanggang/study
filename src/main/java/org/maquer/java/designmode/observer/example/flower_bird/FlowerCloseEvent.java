package org.maquer.java.designmode.observer.example.flower_bird;

import org.maquer.java.designmode.observer.base.Event;

public class FlowerCloseEvent extends Event {
	private static final long serialVersionUID = 1L;

	public FlowerCloseEvent(Object source) {
		super(source);
	}

}

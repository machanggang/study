package org.maquer.java.designmode.observer.example.flower_bird;

import org.maquer.java.designmode.observer.base.Event;

public class FlowerStateChangeEvent extends Event {

	private static final long serialVersionUID = 1L;

	private boolean isOpen;

	public FlowerStateChangeEvent(Object source, boolean isOpen) {
		super(source);
		this.isOpen = isOpen;
	}

	public boolean isOpen() {
		return isOpen;
	}

}

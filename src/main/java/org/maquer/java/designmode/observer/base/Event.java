package org.maquer.java.designmode.observer.base;

import java.util.EventObject;

@SuppressWarnings("serial")
public class Event extends EventObject {
	public Event(Object source) {
		super(source);
	}

}

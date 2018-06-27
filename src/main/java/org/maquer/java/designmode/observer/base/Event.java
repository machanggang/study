package org.maquer.java.designmode.observer.base;

import java.util.EventObject;

/**
 * 事件。包含了产生事件的事件源，可能还包含了事件的一些状态。
 */
@SuppressWarnings("serial")
public class Event extends EventObject {
	public Event(Object source) {
		super(source);
	}
}

package org.maquer.java.designmode.observer.base;

import java.util.EventListener;

@FunctionalInterface
public interface Observer extends EventListener {
	void handleEvent(Event e);
}

package org.maquer.java.designmode.observer.base;

public interface Subject {

	void addObserver(Observer o);

	void deleteObserver(Observer o);

	void notifyObservers(Event e);

	void somethingHappends();
}

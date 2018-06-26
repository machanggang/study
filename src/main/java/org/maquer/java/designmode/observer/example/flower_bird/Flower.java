package org.maquer.java.designmode.observer.example.flower_bird;

import java.util.Vector;

import org.maquer.java.designmode.observer.base.Event;
import org.maquer.java.designmode.observer.base.Observer;

public class Flower {

	private boolean isOpen;

	public boolean isOpen() {
		return this.isOpen;
	}

	public void open() {
		this.isOpen = true;
		System.out.println("花开");
	}

	public void close() {
		this.isOpen = false;
		System.out.println("花闭");
	}

	private Vector<Observer> vec = new Vector<Observer>();

	public void addObserver(Observer o) {
		vec.add(o);
	}

	public void deleteObserver(Observer o) {
		vec.remove(o);
	}

	public void notifyObservers(Event e) {
		vec.forEach(o -> o.handleEvent(e));
	}

}

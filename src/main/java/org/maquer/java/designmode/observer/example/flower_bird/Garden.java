package org.maquer.java.designmode.observer.example.flower_bird;

import org.maquer.java.designmode.observer.base.Observer;

public class Garden {

	public static void main(String[] args) {
		Flower f = new Flower();
		Observer o1 = new Bird("1");
		f.addObserver(o1);
		Observer o2 = new Bird("2");
		f.addObserver(o2);
		Observer o3 = new Bird("3");
		f.addObserver(o3);
		
		f.open();
		f.close();
	}

}

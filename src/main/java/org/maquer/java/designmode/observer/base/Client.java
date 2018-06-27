package org.maquer.java.designmode.observer.base;

import java.util.Vector;

public class Client {

	public static void main(String[] args) {
		// 匿名内部类实现一个事件源
		Subject s = new Subject() {
			private Vector<Observer> vec = new Vector<Observer>();

			@Override
			public void addObserver(Observer o) {
				vec.add(o);
			}

			@Override
			public void deleteObserver(Observer o) {
				vec.remove(o);
			}

			@Override
			public void notifyObservers(Event e) {
				vec.forEach(o -> o.handleEvent(e));
			}

			@Override
			public void somethingHappends() {
				System.out.println("事件发生");
				Event e = new Event(this);
				this.notifyObservers(e);
			}
		};
		// 添加监听器
		s.addObserver(e -> System.out.println("观察者1观察到事件" + e));
		s.addObserver(e -> System.out.println("观察者2观察到事件" + e));

		// 事件发生
		s.somethingHappends();
	}
}

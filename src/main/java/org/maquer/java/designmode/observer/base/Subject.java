package org.maquer.java.designmode.observer.base;

/**
 * 事件源
 */
public interface Subject {

	/**
	 * 添加监听器
	 * 
	 * @param o
	 */
	void addObserver(Observer o);

	/**
	 * 删除监听器
	 * 
	 * @param o
	 */
	void deleteObserver(Observer o);

	/**
	 * 唤醒所有监听器，并让他们处理事件
	 * 
	 * @param e
	 */
	void notifyObservers(Event e);

	/**
	 * 事件发生，发生后需要调用notifyObservers唤醒监听器来处理事件
	 */
	void somethingHappends();
}

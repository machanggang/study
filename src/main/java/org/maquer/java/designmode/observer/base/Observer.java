package org.maquer.java.designmode.observer.base;

import java.util.EventListener;

/**
 * 观察者，也是监听器。
 */
@FunctionalInterface
public interface Observer extends EventListener {
	/**
	 * 处理某个事件
	 * 
	 * @param e
	 */
	void handleEvent(Event e);
}

package org.maquer.java.designmode.observer.example.flower_bird.api_support;

public class Test {

	public static void main(String[] args) {
		// 花园里产生了一朵花
		Flower f = new Flower();
		// 一群蜂鸟飞到花朵上
		f.addObserver(new Bird("1"));
		f.addObserver(new Bird("2"));
		f.addObserver(new Bird("3"));
		// 花开了
		f.open();
		// 花睡觉了
		f.close();
	}

}

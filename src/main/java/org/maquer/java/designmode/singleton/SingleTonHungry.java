package org.maquer.java.designmode.singleton;


public class SingleTonHungry {

    private static SingleTonHungry instance = new SingleTonHungry();

    private SingleTonHungry() {
    }

    public static SingleTonHungry getInstence() {
        return instance;
    }

    public static void main(String[] args) {
    }
}

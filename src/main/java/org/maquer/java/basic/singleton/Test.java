package org.maquer.java.basic.singleton;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SingletonEnum s = SingletonEnum.INSTANCE;
        System.out.println("Map=" + s.getMap());
        s.init();
        System.out.println("Map=" + s.getMap());
    }

}

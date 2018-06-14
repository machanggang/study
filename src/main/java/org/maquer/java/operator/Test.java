package org.maquer.java.operator;

public class Test {

    public static void main(String args[]) {
        test1();
    }

    public static void test1() {
        boolean b = true || false && true;
        System.out.println(b);
    }

    public static void test2() {
        boolean b = false && true || true;
        System.out.println(b);
    }
}

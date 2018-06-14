package org.maquer.java.thinkinginjava.demo.chapter6._final;

class A {
    final void say(String word) {
        System.out.println(word);
    }

    final void say(char c) {
        System.out.println(c);
    }

    void say() {

    }
}

class B extends A {
    // final void say(String word) {}
    void say(int i) {
        System.out.println(i);
    }
}

public class FinalMethod {

    /** 测试private方法，自动成为final方法*/
    private void t() {
        System.out.println("FinalMethod");
    }
    class C extends FinalMethod {
        private void t() {
            System.out.println("C");
        }
    }
    public static void main(String[] args) {
        FinalMethod fm = new FinalMethod();
        FinalMethod c = fm.new C();
        c.t();
    }

}

abstract class D {
//    public  final abstract void test();
}
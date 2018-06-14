package org.maquer.java.thinkinginjava.demo.chapter7;

class WithInner {
    class Inner {
    }
}

// 继承内部类时，构造函数必须传入外部类的对象，并且调用其构造函数
// 
public class InheritInner extends WithInner.Inner {

    InheritInner(WithInner wi) {
//        super();
        wi.super();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

}

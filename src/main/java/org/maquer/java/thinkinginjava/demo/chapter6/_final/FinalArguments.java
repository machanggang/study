package org.maquer.java.thinkinginjava.demo.chapter6._final;

class Gizmo {
    public void spin() {
        
    }
}
public class FinalArguments {

    void with(final Gizmo g) {
//        g = new Gizmo();
        g.spin();
    }
    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }
    void f(final int i) {
//        i++;
    }
    int g(final int i) {
        return i + 1;
    }
    public static void main(String[] args) {
        FinalArguments fa = new FinalArguments();
        fa.without(null);
        fa.with(null);
    }

}

package org.maquer.java.thinkinginjava.demo.chapter7;

public class Parcel7 {
    public Wrapping wrap(int x) {
        // Base constructor call:
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrap(10);
        System.out.println(w.value());

        int i = (new Wrapping(100) {
            public int value() {
                return super.value() * 47;
            }
        }).value();
        System.out.println(i);
    }
}

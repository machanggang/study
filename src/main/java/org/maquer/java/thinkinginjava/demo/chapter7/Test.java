package org.maquer.java.thinkinginjava.demo.chapter7;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.cont();
        Destination d = p.dest("Tanzania");
        // Illegal -- can't access private class:
        // ! Parcel3.PContents c = p.new PContents();
    }

}

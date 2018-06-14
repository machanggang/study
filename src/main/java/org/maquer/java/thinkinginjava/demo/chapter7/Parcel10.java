package org.maquer.java.thinkinginjava.demo.chapter7;

public class Parcel10 {
    private static class PContents extends Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected static class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public static Destination dest(String s) {
        return new PDestination(s);
    }

    public static Contents cont() {
        return new PContents();
    }

    public static void main(String[] args) {
        Contents c = cont();
        Destination d = dest("Tanzania");
    }
}

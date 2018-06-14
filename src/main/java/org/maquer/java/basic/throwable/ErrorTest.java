package org.maquer.java.basic.throwable;


public class ErrorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(t(-1));
    }

    public static int t(int i) {
        try{
            if (i < 0) {
                throw new RuntimeException();
            }
            return 1;
        } finally {
            return -1;
        }
    }
}

package org.maquer.java.practice.online;

public class T {
    String a;
    static String staticA;

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    }

    public void test () {
        new Runnable() {

            @Override
            public void run() {
                System.out.println(a);
                System.out.println(staticA);
            }
            
        };
    }
}

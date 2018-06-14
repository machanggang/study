package org.maquer.java.basic.thread._volatile;

public class TestVolatile {


    /**
     * @param args
     */
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            
        }
    }

    static class NoVolatile implements Runnable{
        public static int count;
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        }
        
    }
    static class Volatile implements Runnable{

        public static volatile int count;
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        }
        
    }
}

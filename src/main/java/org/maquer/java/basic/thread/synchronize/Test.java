package org.maquer.java.basic.thread.synchronize;

public class Test implements Runnable {

    private  String name;
    private static Test t;
    /**
     * @param args
     */
    public static void main(String[] args) {
        t = new Test();
        new Thread(t).start();
        new Thread(t).start();
    }

    @Override
    public void run() {
        test();
    }

    public void test() {
        t = new Test();
        synchronized (t) {
            System.out.println("coming................");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            name = Thread.currentThread().getName();
            System.out.println("name=" + name);
        }

    }
}

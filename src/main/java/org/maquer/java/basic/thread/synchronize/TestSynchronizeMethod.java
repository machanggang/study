package org.maquer.java.basic.thread.synchronize;

public class TestSynchronizeMethod implements Runnable {

    private int count;

    private boolean ifSyn;

    private TestSynchronizeMethod(boolean syn) {
        this.ifSyn = syn;
    }

    public static void main(String args[]) {
        TestSynchronizeMethod t = new TestSynchronizeMethod(false);
//        TestSynchronizeMethod t = new TestSynchronizeMethod(true);
        new Thread(t).start();
        new Thread(t).start();
    }

    @Override
    public void run() {
        if (ifSyn) {
            testSynchronized();
//            testSynchronizedStatic(this);
        } else {
            task();
        }
    }

    public synchronized void testSynchronized() {
        task();
    }

    public synchronized static void testSynchronizedStatic(TestSynchronizeMethod t) {
        t.task();
    }

    public void task() {
        try {
            while (count < 10) {
                count++;
                Thread.sleep(100);
                System.out.println(count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

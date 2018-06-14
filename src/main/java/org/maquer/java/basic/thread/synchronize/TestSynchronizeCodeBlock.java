package org.maquer.java.basic.thread.synchronize;

public class TestSynchronizeCodeBlock implements Runnable {

    private int count;

    private boolean ifSyn;

    private TestSynchronizeCodeBlock(boolean syn) {
        this.ifSyn = syn;
    }

    public static void main(String args[]) {
        // TestSynchronizeCodeBlock t = new TestSynchronizeCodeBlock(false);
        final TestSynchronizeCodeBlock t = new TestSynchronizeCodeBlock(true);
        new Thread(t).start();
        new Thread(t).start();
    }

    @Override
    public void run() {
        if (ifSyn) {
            testSynchronized();
            testSynchronizedStatic(this);
        } else {
            task();
        }
    }

    public void testSynchronized() {
        synchronized (this) {
            task();
        }
    }

    public static void testSynchronizedStatic(TestSynchronizeCodeBlock t) {
        synchronized (TestSynchronizeCodeBlock.class) {
            t.task();
        }
    }

    public void task() {
        try {
            while (count < 10) {
                count++;
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "count is " + count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sayCount() {
        count++;
        System.out.println(Thread.currentThread().getName() + "count is " + count);
    }
}

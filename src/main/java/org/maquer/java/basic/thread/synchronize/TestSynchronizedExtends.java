package org.maquer.java.basic.thread.synchronize;

public class TestSynchronizedExtends {

    /**
     * @param args
     */
    public static void main(String[] args) {
        test(new Son1());
        test(new Son2());
        test(new Son3());
    }

    public static void test(final Father f) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                f.test();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                f.test();
            }
        }).start();
    }
}

class Father {
    public synchronized void test() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("father..." + System.currentTimeMillis());
    }
}

/**
 * 不同步
 */
class Son1 extends Father {
    public void test() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("son1..." + System.currentTimeMillis());
    }
}

/**
 * 加了synchronized，同步
 */
class Son2 extends Father {
    public synchronized void test() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("son2..." + System.currentTimeMillis());
    }
}

/**
 * 调用父类方法，同步
 */
class Son3 extends Father {
    public void test() {
        super.test();
    }
}

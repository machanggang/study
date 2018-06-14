package org.maquer.java.thinkinginjava.demo.chapter6._final;

public class FinalData {

    final int i1 = 9;

    static final int I2 = 99;

    public static final int I3 = 39;

    final int i4 = (int) (Math.random() * 20);

    static final int i5 = (int) (Math.random() * 20);

    Value v1 = new Value();

    final Value v2 = new Value();

    static final Value v3 = new Value();

    // java1.1以前会报错，没有初始化
//    final Value v4;

    final int[] a = { 1, 2, 3, 4, 5, 6 };

    public void print(String id) {
        System.out.println(id + ": + i4 = " + i4 + ", i5 = " + i5);
    }
    public static void main(String[] args) {
        FinalData fd1 = new FinalData();
//        fd1.i1++;
        fd1.v2.i++;
        fd1.v1 = new Value();
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
//        fd1.v2 = new Value();
//        fd1.v3 = new Value();
//        fd1.a = new int[3];
        fd1.print("fd1");
        System.out.println("creating new FinalData");
        FinalData fd2 = new FinalData();
        fd1.print("fd1");
        fd2.print("fd2");
    }

}

class Value {
    int i = 1;
}

package org.maquer.java.basic.throwable;

public class NullPointerExceptionTest {

    int i;

    static int staticI;

    /**
     * @param args
     */
    public static void main(String[] args) {
        NullPointerExceptionTest t = null;
        try {
            t.a();
        } catch (NullPointerException e) {
            System.out.println("调用非静态方法报空指针");
        }
        try {
            t.staticA();
        } catch (NullPointerException e) {
            System.out.println("调用静态方法报空指针");
        }
        try {
            t.i = 0;
        } catch (NullPointerException e) {
            System.out.println("调用非静态变量报空指针");
        }
        try {
            t.staticI = 0;
        } catch (NullPointerException e) {
            System.out.println("调用静态变量报空指针");
        }

        int[] arr = null;
        try {
            int i = arr.length;
        } catch (NullPointerException e) {
            System.out.println("调用null数组的长度报空指针");
        }
        try {
            int i = arr[0];
        } catch (NullPointerException e) {
            System.out.println("调用null数组的某个元素报空指针");
        }
        try {
            throw null;
        } catch (NullPointerException e) {
            System.out.println("throw null报空指针");
        }
    }

    public void a() {

    }

    public static void staticA() {

    }
}

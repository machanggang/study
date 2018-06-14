package org.maquer.java.designmode.prototype;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        testObjectClone();
    }

    public static void testObjectClone() {
        // 使用匿名内部类来调用Object里protected的clone方法
        (new Object(){
            public Object callClone() {
                try {
                    return super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }).callClone();

        // 实现了Cloneable则不报CloneNotSupportedException
        (new Cloneable(){
            public Object callClone() {
                try {
                    return super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }).callClone();
    }
}

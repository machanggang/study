package org.maquer.java.basic.clazz;

public class OuterClass {

    class InnerClass {

    }

    public static class InnerClassStatic {

    }

    public static void main(String[] args) {
        InnerClass i = new OuterClass().new InnerClass();
        InnerClassStatic is = new OuterClass.InnerClassStatic();

    }

}

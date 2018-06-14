package org.maquer.java.basic.clazz;

public class Test {
    public static void main(String[] args) {
        // 初始化Bean1
        Bean1 bean1 = new Test().new Bean1();
        bean1.I++;
        // 初始化Bean2
        Bean2 bean2 = new Test.Bean2();
        bean2.J++;
        // 初始化Bean3
        Bean.Bean3 bean3 = new Bean().new Bean3();
        bean3.k++;
    }

    class Bean1 {
        public int I = 0;
    }

    static class Bean2 {
        public int J = 0;
    }
}

class Bean {
    class Bean3 {
        public int k = 0;
    }
}

class Person {
    static String country = "CN";
    public Person() {
        country = "US";
        System.out.println("Person初始化");
    }
    public void show() {
        System.out.println(country);
    }
}
class PersonTest {
    public static void main(String[] args) {
        System.out.println(Person.country);
        Person p = new Person();
        p.show();
    }
}
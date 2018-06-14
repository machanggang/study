package org.maquer.java.thinkinginjava.demo.chapter9;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Fu f = null;
        try {
            f = new Zi();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(f instanceof A);
        A a = (A) f;

    }
}

class Fu {
    Fu() throws Exception {
        
    }
     void t(){
         System.out.println("Fu");
     }
}

interface A {
    void t();
}

class Zi extends Fu implements A {
    Zi() throws Exception {
        super();
        // TODO Auto-generated constructor stub
    }

    public void t() {
        System.out.println(this instanceof A);
        System.out.println(this instanceof Fu);
        System.out.println(this instanceof Zi);
        super.t();
    }
}
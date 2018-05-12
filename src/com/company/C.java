package com.company;

class AA {
    void foo() {
        System.out.println("I m A");
    }
}


class BB extends AA{
    void foo() {
        //System.out.println("I m B");
        super.foo();
    }
}


public class C extends BB{
    void foo() {
        //System.out.println("I m C");
        super.foo();
    }

    public static void main(String[] args) {
        C c = new C();
        c.foo();
    }
}

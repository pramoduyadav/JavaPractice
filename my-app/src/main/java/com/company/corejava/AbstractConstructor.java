package com.company.corejava;


 abstract class Emp {

    public Emp() {
        System.out.println("Emp constructor");
    }

    abstract void method();
}
public class AbstractConstructor extends Emp {

    public AbstractConstructor() {
        System.out.println("AbstractConstructor");
    }

    @Override
    void method() {
        System.out.println("method");
    }

    public static void main(String[] args) {
           AbstractConstructor a =new AbstractConstructor();

    }


}

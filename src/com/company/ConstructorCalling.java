package com.company;

public class ConstructorCalling {

    ConstructorCalling() {
        greeting();
        prints();
    }

    void greeting() {
        System.out.println("Instance method from A");
    }

    static void prints() {
        System.out.println("static method from A");
    }

    public static void main(String[] args) {
        new BBB();
    }
}

class BBB extends ConstructorCalling {
    BBB(){
     //greeting();
     //prints();
    }

    void greeting() {
        System.out.println("Instance method from B");
    }

    static void prints() {
        System.out.println("static method from B");
    }
}



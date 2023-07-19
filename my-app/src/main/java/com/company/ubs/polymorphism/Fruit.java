package com.company.ubs.polymorphism;

public class Fruit {
    public void taste() {
        System.out.println("taste me");
    }

    public void color() {
        System.out.println("color me");
    }
}


class Apple extends Fruit {
    public void size() {
        System.out.println("Size of me");
    }
}

class TestMe {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.taste();
        f.color();
      //  f.size();

        //Apple a = new Fruit();

    }

}

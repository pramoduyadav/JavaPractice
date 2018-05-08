package com.company;

import java.util.function.Consumer;



interface harish {
   static void left() {
       System.out.printf("dsad");
   };

   default void right() {
       System.out.println("I m default");
   };
}

class pramod implements harish{

//    @Override
//    public void left() {
//        System.out.println("hwhwqe");
//    }


}

public class ConsumerTest {

    public static void main(String[] args) {

        pramod p = new pramod();
        p.right();


        new Thread(() -> { System.out.println("I m here");
                           System.out.println();
                         }

            ).start();

        Consumer <String> consumer1 = (arg) -> {
                System.out.println(arg + "OK");
        };

        consumer1.accept("TestConsumerAccept - ");

        Consumer <String> consumer2 = (x) -> {
                System.out.println(x + "OK!!!");
        };

        consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");
    }


}

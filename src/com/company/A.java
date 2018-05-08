package com.company;

import java.io.IOException;
import java.net.SocketException;
import java.sql.SQLException;

class A {
    public void foo() throws IOException {
        System.out.println();
    }
}

class B extends A {
    @Override
    public void foo() throws SocketException {
        System.out.println("safsdfsdf");
    } // allowed
//
//    @Override
//    public void foo() throws SQLException {
//        System.out.println("safsdfsdf");
//    } // NOT allowed

    public static void main(String[] args) {
        B b = new B();
       try{
           b.foo();
       } catch(Exception e) {

       }
    }
}
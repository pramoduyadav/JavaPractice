package com.company.generics.generics2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C extends A {

    @Override
    public String toString() {
        return "I am C";
    }

    public static void main(String[] args) {
        List<A> lst = new ArrayList<>();
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        List<Object> listObj = new ArrayList<>();
//
//        listA = listB;    // compile error
//        listB = listA;    // compile error

        //List<C>    lst1 =
         // methodOne(lst);

      List<C> lst1 = new ArrayList<>();
      lst1.add(new C());
      lst1.add(new C());

        List<B> lst2= new ArrayList<>();
        lst2.add(new B());
        lst2.add(new B());

        List<A> lst3= new ArrayList<>();
        lst3.add(new B());
        lst3.add(new C());

        methodTwo(lst1);
        methodTwo(lst2);
        methodTwo(lst3);
        //methodTwo(listObj); error
    }

    public static void methodTwo(List<? extends A> lst) {

        Iterator it = lst.iterator();
        while(it.hasNext()) {
            A a = (A) it.next();
            System.out.println(a.toString());

        }

//      Below 3 statements will throw compile time error
//        lst.add(new A());
//        lst.add(new B());
//        lst.add(new C());
    }

    public static void methodOne(List<? super A> lst) {
        lst.add(new A());
        lst.add(new B());
        lst.add(new C());
        lst.add(new D());
        //lst.add(new Object());
        System.out.println(lst.size());
        System.out.println(lst.get(0));
        System.out.println(lst.get(1));
        System.out.println(lst.get(2));
        System.out.println(lst.get(3));
    }
}

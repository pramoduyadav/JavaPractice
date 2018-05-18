package generics;

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

        List<A> listA = new ArrayList<A>();
        List<B> listB = new ArrayList<B>();
//
//        listA = listB;  //
//        listB = listA;

        //List<C> lst1 =
//          methodOne(lst);

          List<C> lst1 = new ArrayList<>();
          lst1.add(new C());
          methodTwo(lst1);
    }

    public static void methodTwo(List<? extends A> lst) {

        Iterator it = lst.iterator();
        while(it.hasNext()) {
            A a = (A)it.next();
            System.out.println(a.toString());

        }

//
//        lst.add(new A());
//        lst.add(new B());
//        lst.add(new C());
    }

    public static void methodOne(List<? super A> lst) {
        lst.add(new A());
        lst.add(new B());
        lst.add(new C());
    }
}

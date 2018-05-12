package generics;

import java.util.ArrayList;
import java.util.List;

public class C extends A {
    public static void main(String[] args) {
        List<A> lst = new ArrayList<>();

        List<A> listA = new ArrayList<A>();
        List<B> listB = new ArrayList<B>();
//
//        listA = listB;  //
//        listB = listA;

        //List<C> lst1 =
          methodOne(lst);
    }

    public static void methodOne(List<? super A> lst) {
        lst.add(new A());
        lst.add(new B());
        lst.add(new C());
    }
}

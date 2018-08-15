package com.company.ubs.test4;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends A {}

public class GenericsTest<V extends B> {
    List<? super V> method() {
//      return new ArrayList<V>();   //will work
//      return new ArrayList<A>();  //will work
//      return new ArrayList<B>();  //will work
//      return new ArrayList<C>();
      return new ArrayList<Object>(); //will work
    }
}

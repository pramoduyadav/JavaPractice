package generics.ubs.test4;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}

public class GenericsTest<V extends B> {
    List<? super V> method() {
//      return new ArrayList<V>();
//      return new ArrayList<A>();
//      return new ArrayList<B>();
      //return new ArrayList<C>();
      return new ArrayList<Object>();
    }
}

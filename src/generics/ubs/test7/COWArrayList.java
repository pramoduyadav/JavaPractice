package generics.ubs.test7;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("London");
        list.add("Paris");
        list.add("Rome");
        Iterator<String> iterator = list.iterator();
        list.remove("Paris");
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}

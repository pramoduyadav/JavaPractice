package com.company.ubs.test7;

import java.util.ArrayList;
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
            //System.out.println(iterator.next() + " ");
            if(iterator.next().equals("London")) {
                iterator.remove();
            }
        }

        System.out.println(list);
        //System.out.println(iterator);

        System.out.println("======================================");
        
        // Below will throw ConcurrentModificationException
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("London1");
        arrayList.add("Paris1");
        arrayList.add("Rome1");
        Iterator<String> iterator1 = arrayList.iterator();
        //arrayList.remove("London1");
        while(iterator1.hasNext()) {
            if(iterator1.next().equals("London1")) {
                iterator1.remove();
            }
            //System.out.println(iterator1.next() + " ");
        }

        System.out.println(arrayList);

    }
}

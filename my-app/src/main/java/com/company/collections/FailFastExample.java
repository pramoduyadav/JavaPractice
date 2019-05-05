package com.company.collections;

import java.util.*;

public class FailFastExample
{


    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("IPhone");
        lst.add("Samsung");
        lst.add("HTC");
        lst.add("Nokia");

        Iterator<String> itr = lst.iterator();
        lst.remove("HTC"); // because of this line will throws ConcurrentModificationException while iterating
        // We are trying to modify the list Obj after creation of iterator object.

        while(itr.hasNext()) {
            if(itr.next().equalsIgnoreCase("IPhone")) {
                System.out.println("removed");
                itr.remove();

            }
        }

        lst.remove("Samsung");

        System.out.println(lst);
//        Set<String> phoneSet = new TreeSet<>();
//        phoneSet.add("IPhone");
//        phoneSet.add("Samsung");
//        phoneSet.add("HTC");
//        phoneSet.add("Nokia");
//
//        Iterator<String> itr1 = phoneSet.iterator();
//
//        while(itr1.hasNext()) {
//            System.out.println(itr1.next());
//            phoneSet.add("Xioami");
//        }

        //itr.forEachRemaining(it -> System.out.println(it.toString()));

//
//        Map<String,String> premiumPhone = new TreeMap<String,String>();
//        premiumPhone.put("Samsung","S5");
//        premiumPhone.put("Apple", "iPhone");
//        premiumPhone.put("HTC", "HTC one");
//
//
//        Iterator iterator = premiumPhone.keySet().iterator();
//
//        while (iterator.hasNext())
//        {
//            System.out.println(premiumPhone.get(iterator.next()));
//           // premiumPhone.put("Sony", "Xperia Z");
//        }

    }

}

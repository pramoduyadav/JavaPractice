package com.company.collections;

import java.util.*;

public class FailFastExample
{


    public static void main(String[] args)
    {
        Set<String> phoneSet = new TreeSet<>();
        phoneSet.add("IPhone");
        phoneSet.add("Samsung");
        phoneSet.add("HTC");
        phoneSet.add("Nokia");

        Iterator<String> itr = phoneSet.iterator();
//
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//            //phoneSet.add("Xioami");
//        }

        itr.forEachRemaining(it -> System.out.println(it.toString()));

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

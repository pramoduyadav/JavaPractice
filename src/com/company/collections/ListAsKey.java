package com.company.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAsKey {

    // We are adding immutable object as key to HashMap which is bad practice
    //

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>() {{
            add("Pramod");
            add("Manoj");
            add("Vinod");
        }};

        System.out.println(strList.toString());
        System.out.println(strList.hashCode());

        HashMap<List<String>, String> hsmap = new HashMap<>();
        hsmap.put(strList, "prem"); // At this point strList hashcode generated and added to hashmap

        strList.set(0, "Pramod Yadav");

        System.out.println(strList.toString());
        System.out.println(strList.hashCode());

        // strList hashcode generated is different now from above because it has changed after changing element at 0
        // and hence strList will be added again with different hashcode
        hsmap.put(strList, "prem");

        System.out.println("Hashmap size :: "+hsmap.size());


        Map<String, String> map2 = new HashMap<>();
        map2.put("prem", "pra");
        map2.put("prem", "pra");

        System.out.println(map2.size());
    }
}

package com.htp.tasks.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparisonTest {
    public static void main(String[] args) {
        //comparison test for two Lists
        System.out.println("comparison test for two Lists");
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        List<String> list2 = new ArrayList<String>();
        list2.add("E");
        list2.add("F");
        list2.add("A");
        list2.add("B");
        list2.add("C");
        System.out.println("Interection");
        System.out.println(new CompareClass().intersection(list1, list2));
        System.out.println("Union");
        System.out.println(new CompareClass().union(list1, list2));

        //comparison test for two Maps
        System.out.println("comparison test for two Maps");
        Map<Integer, String> map1 = new HashMap();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(5, "E");
        map2.put(7, "D");
        map2.put(6, "F");
        map2.put(2, "B");
        System.out.println(new CompareClass().unionMapUniqueKeys(map1, map2));
    }
}

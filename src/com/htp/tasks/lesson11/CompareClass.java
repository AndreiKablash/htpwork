package com.htp.tasks.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BinaryOperator;

public class CompareClass {
    //union of two lists
    public <T> Set<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();
        set.addAll(list1);
        set.addAll(list2);
        return set;
    }

    //intersection of two lists
    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();
        for (T t : list1) {
            if (list2.contains(t)) {
                list.add(t);
            }
        }
        return list;
    }

    //union of two Maps by the unique keys
    public <T1, T2> Map<T1, T2> unionMapUniqueKeys(Map<T1, T2> map1, Map<T1, T2> map2) {
        TreeMap<T1, T2> map3 = new TreeMap<>();
        map3.putAll(map1);
        map3.putAll(map2);
        return map3;
    }
    //Method doesn't work
   /* public <T1, T2> HashMap<T1, Object> unionMapUniqueValues(Map<T1, T2> map1, Map<T1, T2> map2) {
        HashMap<T1, Object> map3 = new HashMap<T1,Object>();
        map3.putAll(map2);
        map3.putAll(map1);
        Set<Map.Entry<T1,T2>> entries = map1.entrySet();
        for (Map.Entry<T1,T2> entry: entries) {
            HashSet<Object> hashSet;
            if (entry.getKey().equals(map2.get(entry.getKey()))) {
                hashSet = new HashSet<>();
                hashSet.add(entry.getValue());
                hashSet.add(map2.get(entry.getValue()));
                map3.put(entry.getKey(), hashSet);
            }
        }
        return map3;
    }*/

//    public static <K, V> Map<K, V> merge(Map<K, V> map1, Map<K, V> map2, BinaryOperator<V> combiner) {
//        Map<K, V> map3 = new HashMap<>(map1);
//        map2.forEach((k, v) -> map3.merge(k, v, combiner::apply));
//        return map3;
//    }
}

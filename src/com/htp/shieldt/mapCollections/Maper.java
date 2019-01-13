package com.htp.shieldt.mapCollections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maper {
    public static void main(String args[]) {
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        hashMap.put("Джон доу", new Double(123.1));
        hashMap.put("Генри Митчел", new Double(52.4));
        hashMap.put("Джарет Шоу", new Double(-334.1));

        System.out.println(hashMap);
        double balance = hashMap.get("Джон доу");
        hashMap.put("Джон доу",balance+10000);
        System.out.println(hashMap);


        System.out.println("call sort for surnames");
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new MySurnameSort());
        tm.put("Джон Доу", new Double(123.1));
        tm.put("Генри Митчел", new Double(52.4));
        tm.put("Джарет Шоу", new Double(-334.1));
        tm.put("Дин Шоу", new Double(-334.1));
        Set<Map.Entry<String,Double>> set = tm.entrySet();
        for(Map.Entry<String,Double> me: set){
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println(" ");


        TreeMap<String, Double> tms = new TreeMap<String,Double>(new MyCompForString());
        tms.put("2",new Double(2));
        tms.put("1",new Double(1));
        tms.put("4",new Double(4));
        tms.put("3",new Double(3));
        tms.put("5",new Double(5));
        System.out.println(tms);

    }


}

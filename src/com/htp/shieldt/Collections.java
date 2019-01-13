package com.htp.shieldt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Collections {
    public static void main(String args[]){
        System.out.println("List Iterator");
        ArrayList<String> link = new ArrayList<>();
        link.add("A");
        link.add("C");
        link.add("e");
        link.add("V");
        link.add("1");
        System.out.println(link);
        ListIterator<String> lir = link.listIterator();
        while(lir.hasNext()){
            String element = lir.next();
            lir.set(element + "1");
        }
        System.out.println(link);
        System.out.println("end of list iterator ");
        while(lir.hasPrevious()){
            String s = lir.previous();
            System.out.print(s);
        }


        HashSet<String> hasr = new HashSet<>();
        hasr.add("A");
        hasr.add("C");
        hasr.add("e");
        hasr.add("V");
        hasr.add("1");
        System.out.println(hasr);
        Iterator<String> ir = hasr.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
        System.out.println("after iterator");
        System.out.println(hasr);

        System.out.println("linkedHashSet");
        LinkedHashSet<String> lhasr = new LinkedHashSet<>();
        lhasr.add("A");
        lhasr.add("C");
        lhasr.add("e");
        lhasr.add("V");
        lhasr.add("1");
        System.out.println(lhasr);


        TreeSet<String> thasr = new TreeSet<>();
        thasr.add("A");
        thasr.add("C");
        thasr.add("e");
        thasr.add("1");
        thasr.add("V");
        System.out.println(thasr);
        System.out.println(thasr.subSet("C","v"));

        PriorityQueue<String> qq = new PriorityQueue<>();
        qq.add("A");
        qq.add("C");
        qq.add("e");
        qq.add("1");
        qq.add("V");
        System.out.println(qq);

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("R");
        deque.add("E");
        deque.add("1");
        deque.add("r");
        System.out.println("out ");
        while(deque.peek()!=null){
            System.out.println(deque.pop());
        }

    }
}

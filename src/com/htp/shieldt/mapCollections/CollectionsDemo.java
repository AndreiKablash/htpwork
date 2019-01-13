package com.htp.shieldt.mapCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-6);
        ll.add(25);
        ll.add(-79);
        ll.add(323);
        //reverse comparator
        System.out.println("reversed");
        Comparator<Integer> comparRev = Collections.reverseOrder();
        Collections.sort(ll,comparRev);
        //show reversed collection
        for(int i: ll){
            System.out.print(ll);
        }

        System.out.println();
        System.out.println("suffled");
        //shuffle collection
        Collections.shuffle(ll);
        for(int i: ll){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("min from ll" + Collections.min(ll));
        System.out.println("max from ll" + Collections.max(ll));
    }
}

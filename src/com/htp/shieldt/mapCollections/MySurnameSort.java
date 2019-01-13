package com.htp.shieldt.mapCollections;

import java.util.Comparator;

public class MySurnameSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String a,b;
        int i,j,k;
        a = o1;
        b= o2;
        i = a.lastIndexOf(" ");
        j = b.lastIndexOf(" ");
        k= a.substring(i).compareTo(b.substring(j));
        if(k==0)
            return a.compareTo(b);
        else
            return k;
    }
}

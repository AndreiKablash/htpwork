package com.htp.shieldt.compareListObjects;

import java.util.ArrayList;
import java.util.List;

public class Insert {
    private ArrayList<String> arrayList;

    public Insert() {
    }

    public Insert(ArrayList<String> arrayList) {
        this.arrayList = new ArrayList<>();
    }

    public List<String> insert(int x){
        for(int i=1;i<x;i++){
            arrayList.add((String.valueOf((char)i)));
        }
        return arrayList;
    }
}

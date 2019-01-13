package com.htp.shieldt.serializable.serializationInFile;

import java.io.Serializable;

public class Counter implements Serializable {
    private int value;
    private String name;
    public Counter(int value,String name){
        this.value=value;
        this.name=name;
    }
    public String toString(){
        return name + ": " + value;
    }
}

package com.htp.lessons.lesson6.util;

public class GenericRestriction<T> {
   // private static T x;//error
    private  T y;

    public static <V> void method(V obj){
       // T var; //error
        V typeVar;
    }
}

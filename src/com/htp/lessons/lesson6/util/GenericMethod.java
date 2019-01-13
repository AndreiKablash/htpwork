package com.htp.lessons.lesson6.util;

public class GenericMethod {
    public static <T extends Number, K extends  Object> byte someGeneric(T value, K seconValue){
        //System.out.println(c); use static content baned
        return value.byteValue();
    }

    public int c;
}

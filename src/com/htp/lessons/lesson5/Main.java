package com.htp.lessons.lesson5;

import com.htp.lessons.Test1.Lesson3;

public class Main {
    public static <instanseof> void main(String[] args) {
        //MyInterface myInterface =new MyInterface() {}
        MyInterface lesson5 = new Lesson5();
        MyParentInterface lesson51 = new Lesson5();
        Lesson3 lesson3 = new Lesson3();
        lesson5.someIntegerInterfaceMethod();
        lesson51.parentMethod();

        /*if (lesson3 instanseof MyParentInterface){
            System.out.println("inst ne rabotaet");}
            else{
                System.out.println("rabotaet");
            }
        */

    }
}

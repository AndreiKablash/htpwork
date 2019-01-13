package com.htp.lessons.Test1;

public class TastProtect {
    public static void main(String[] args) {
        Lesson3 Lesson3 = new Lesson3();
        System.out.println(Lesson3.a);
        //System.out.println(Lesson3.b);
        System.out.println(Lesson3.c);
       // System.out.println(Lesson3.d);

    Lesson3.A=4;
    Lesson3 simpleCalc = new Lesson3();
    Lesson3 qweqweqwe=new Lesson3();
    simpleCalc.setA(5);
    qweqweqwe.setA(6);
        System.out.println(simpleCalc.getA());
        System.out.println(simpleCalc.getA());



    }
}

package com.htp.lessons.test;

import java.util.Arrays;

public class B {
    private int a;
    private String b;
    private String c;
    private B[] barr = new B[10];

    public B() {
    }

    public B(int a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public B(B[] barr) {
        this.barr = barr;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public B[] getBarr() {
        return barr;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setBarr(B[] barr) {
        this.barr = barr;
    }

    void search(){
        int num=0;
        for(B t: barr){
            if(t.getB().equals(b)){
                System.out.println(t);
                num++;
            }
        }
        if(num==0) System.out.println("There is no such train");
    }
    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", barr=" + Arrays.toString(barr) +
                '}';
    }
}

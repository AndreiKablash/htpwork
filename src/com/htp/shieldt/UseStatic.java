package com.htp.shieldt;

public class UseStatic {
    static int a=3;
    static int b=11;

    static void callMe(){
        System.out.println("a = " + a);
    }

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static{
        System.out.println("статический блок инициализации");
        b=a*4;
    }

    public static void main(String[] args) {
        meth(10);
    }
}

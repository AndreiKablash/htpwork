package com.htp.shieldt;

public class PassArray {
    static void vaTest(String mgs, int ... v){
        System.out.println("переменное количество аргументов = " + v.length);
        for(int x: v){
            System.out.print(mgs + " "+ x+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        //int n[]={1,2,3};
       //int n2[]={1};
       // int n3[]={12,23,3,45,45,45,};
        vaTest("привет",1,2,3,4);
        vaTest("пока", 2);
        vaTest("ok");
    }
}

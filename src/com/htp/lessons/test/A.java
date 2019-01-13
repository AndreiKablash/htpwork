package com.htp.lessons.test;

public class A {
    public static void main(String[] args) {
        B bb=new B();
        B[] br = new B[5];
        br[0]=new B(1,"name1","surname1");
        br[1]=new B(2,"name2","surname2");
        br[2]=new B(3,"name3","surname3");
        br[3]=new B(4,"name4","surname4");
        br[4]=new B(5,"name5","surname5");
        System.out.println(bb.getBarr());
        //bb.setB("name1");
        //bb.search();
        bb.setB("name5");
        System.out.println(bb.getB());
       // for(int i=0;i<br.length;i++){
        bb.setBarr(br);
        //}
        System.out.println(bb.getBarr());
        bb.search();
    }
}

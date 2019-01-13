package com.htp.shieldt;

public class PassOb {
    public static void main(String[] args) {
        Test ob =new Test(2);
        Test ob1;
        ob1=ob.incrByTen();
        System.out.println(ob.a);
        System.out.println(ob1.a);
        ob1=ob1.incrByTen();
        System.out.println(ob1.a);
    }
}

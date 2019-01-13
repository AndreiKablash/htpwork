package com.htp.shieldt;
class Test1{
    int a;
    public int b;
    private int c;
    void setc(int i){
        c=i;
    }
    int getc(){
        return c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.a=1;
        test.b=3;
        //test.c=10;
        test.setc(10);
        System.out.println("a = " + test.a);
        System.out.println("b = " + test.b);
        System.out.println("c = " + test.getc());
    }
}

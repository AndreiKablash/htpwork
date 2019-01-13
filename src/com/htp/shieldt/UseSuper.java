package com.htp.shieldt;
class A1{
    int i;
}
class B1 extends A1{
    int i;
    B1(int a,int b){
       super.i=a;
       i=b;
    }
    void showi(){
        System.out.println("super.i = " + super.i);
        System.out.println("i in B = " + i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        B1 b1=new B1(1,2);
        b1.showi();
    }

}

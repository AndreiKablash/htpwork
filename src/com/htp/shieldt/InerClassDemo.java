package com.htp.shieldt;
class Outer{
    int outer_x=100;
    void test(){
       Inner inner = new Inner();
       inner.display();
    }
    class Inner{
        int y=1;
        void display(){
            System.out.println("outer_x = " +outer_x);
        }
    }
    /*void showy(){
        System.out.println(y);
    }*/
}
public class InerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

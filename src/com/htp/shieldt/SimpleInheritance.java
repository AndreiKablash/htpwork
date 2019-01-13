package com.htp.shieldt;
class A{
    int i;
    int j;

    public A() {
    }

    public A(int a, int b) {
        this.i = a;
        this.j = b;
    }
    void showij(){
        System.out.println("i and j " + i + " and "+ j);
    }

    void callMe(){
        System.out.println("внутри метода callMе класс А");
    }
}
class B extends A{
    int k;

    public B() {
    }

    public B(int a, int b, int k) {
        super(a, b);
        this.k = k;
    }
    void  showk(){
        System.out.println("k= "+ k);
    }
    void sum(){
        System.out.println("k+i+j = "+(i+j+k));
    }
    void callMe(){
        System.out.println("внутри метода callMе класс B");
    }
}
class C extends B{

    public C() {
    }

    public C(int a, int b, int k) {
        super(a, b, k);
    }
    void callMe(){
        System.out.println("внутри метода callMе класс C");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A(1,2);
        B subOb = new B(2,3,4);
        //super
        //superOb.i=10;
       //superOb.j=20;
        superOb.showij();
        System.out.println();

        //sub
        //subOb.i=7;
        //subOb.j=8;
        //subOb.k=9;
        subOb.showij();
        subOb.showk();
        subOb.sum();

        A a = new A();
        B b=new B();
        C c = new C();

        A r;
        r=a;
        r.callMe();
        r=b;
        r.callMe();
        r=c;
        r.callMe();

    }
}

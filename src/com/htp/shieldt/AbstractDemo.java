package com.htp.shieldt;
abstract class AA{
    abstract void callMeA();
    void callMeToo(){
        System.out.println("this is specific method");
    }
}
class BB extends AA{
    @Override
    void callMeA() {
        System.out.println("The realization of the method callMe in class B");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        BB bb=new BB();
        bb.callMeA();
        bb.callMeToo();
    }
}

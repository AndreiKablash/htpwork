package com.htp.shieldt.synchronize;

public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + "enter in A.foo");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(name + "trying to call B.last");
        b.last();
    }
    synchronized void last(){
        System.out.println(" in A.last ");
    }
}


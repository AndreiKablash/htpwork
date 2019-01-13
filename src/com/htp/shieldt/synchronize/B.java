package com.htp.shieldt.synchronize;

public class B {
        synchronized void bar(A a){
            String name = Thread.currentThread().getName();
            System.out.println(name + "enter in B.bar");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + "trying to call A.last");
            a.last();
        }
        synchronized void last(){
            System.out.println(" in B.last ");
        }
}

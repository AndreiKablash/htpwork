package com.htp.shieldt.synchronize;

public class DeadLock implements Runnable{
    A a= new A();
    B b = new B();

    public DeadLock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RunninThread");
        t.start();
        a.foo(b);
        System.out.println("back into main thread");
    }
    @Override
    public void run() {
        b.bar(a);
        System.out.println("back into main Thread");
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}

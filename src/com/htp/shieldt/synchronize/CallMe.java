package com.htp.shieldt.synchronize;

public class CallMe {
    void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(String s, CallMe targ) {
        msg = s;
        target = targ;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}

class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller c1 = new Caller("welcome", target);
        Caller c2 = new Caller("in sychronized", target);
        Caller c3 = new Caller("world", target);
        try {
            c1.t.join();
            c2.t.join();
            c3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted ");
        }
    }
}

package com.htp.shieldt.synchronize;

public class NewThread implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread(String threadName) {
        name = threadName;
        t= new Thread(this, name);
        System.out.println("new stream");
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i= 15;i>0;i--){
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

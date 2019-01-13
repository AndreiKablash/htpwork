package com.htp.shieldt.stream.videoEpam;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Operations {
    private final static int WAIT_SEC = 1000;
   // private static final Object lockObject = new Object(); - recommendation of sonarlink to use lockobject in synchronized as object
    static void transfer(Account acc1, Account acc2, int amount) throws InsufficientFundsException,InterruptedException {
            if (acc1.getL().tryLock(WAIT_SEC, TimeUnit.SECONDS)){
                //acc1.getL().lock();
                try {
                    if (acc2.getL().tryLock(WAIT_SEC, TimeUnit.SECONDS)){
                    //    acc2.getL().lock();
                        try {
                            acc1.withdraw(amount);
                            acc2.deposit(amount);
                        } finally {
                            System.out.println("in second try");
                            acc2.getL().unlock();
                        }
                    }else{
                        System.out.println("failure of threads in acc2");
                        acc2.failcounter();
                    }
                }finally {
                    System.out.println("in first try");
                    acc1.getL().unlock();
                }
            } else {
                System.out.println("failure of threads in acc1");
                acc1.failcounter();
                System.out.println();
            }
    }

    public static void main(String[] args) throws InsufficientFundsException,InterruptedException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);
        new Thread(new Runnable() {
            public void run() {
                try {
                    transfer(a, b, 500);
                } catch (InsufficientFundsException e) {
                    e.printStackTrace();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
        transfer(b, a, 300);
        //output of results
        System.out.println("a balance = " + a.getBalance());
        System.out.println("b balance = " + b.getBalance());

       /* //DeadLock analyzing "method"
        // Thread.sleep(1000);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();
        if(deadlockedThreads!= null){
            ThreadInfo[] threadInfo = threadMXBean.getThreadInfo(deadlockedThreads);
            for (ThreadInfo info: threadInfo
            ) {
                System.out.println(info);
            }
        }*/


    }
}

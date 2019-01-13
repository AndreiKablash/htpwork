package com.htp.lessons.leson13streem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OperatorDeposit extends Thread{
    private Account account;
   // private Lock lock = new ReentrantLock();


    public OperatorDeposit(Account account) {
        this.account = account;
    }
    public void run(){
       // lock.lock();
        for(int i=0; i<5;i++){
            synchronized (account){
            account.deposit(100);
            }
        }
       // lock.unlock();
    }
}

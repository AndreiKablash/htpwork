package com.htp.shieldt.stream.videoEpam;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    private Lock l;
    private AtomicInteger failcounter = new AtomicInteger();

    public Account(int balance) {
        this.balance = balance;
        this.l = new ReentrantLock();
    }

    public int getBalance() {
        return balance;
    }

    public Lock getL() {
        return l;
    }

    public AtomicInteger getFailcounter() {
        return failcounter;
    }

    //method deposit
    public void deposit(int amount){
             balance += amount;
    }
    //method withdraw
    public void withdraw(int amount){
            balance-=amount;
        }

    //counter
    public void failcounter(){
        failcounter.incrementAndGet();
    }

}

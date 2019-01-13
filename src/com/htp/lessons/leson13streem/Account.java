package com.htp.lessons.leson13streem;

public class Account {
    private int balance;
    private final Object lock = new Object();


    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){
        synchronized (lock){
            int x = balance + amount;
            try{
                Thread.sleep(15);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            balance = x;
            }
    }

    public synchronized void withdraw(int amount){
        synchronized (lock){
            int x = balance + amount;
            try{
                Thread.sleep(15);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            balance = x;
        }
    }
}

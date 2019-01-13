package com.htp.shieldt.synchronize;

public class Q {
    int n;
    boolean ValueSet = false;
    synchronized int getN(){
        while(!ValueSet)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("InterruptedException was caugth");
            }
        System.out.println(" was got n: " + n);
        ValueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while (ValueSet)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("InterruptedException was caugth");
            }
        this.n= n;
        ValueSet = true;
        System.out.println("sended n: "+ n);
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"supplier ").start();
    }
    @Override
    public void run() {
        int i =0;
        while(true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    @Override
    public void run() {
        while(true){
            q.getN();
        }
    }
}
class PC{
    public static void main(String[] args) {
        Q q= new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("to stop insert Control+C");
    }
}
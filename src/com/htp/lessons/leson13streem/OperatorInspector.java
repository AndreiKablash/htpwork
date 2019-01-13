package com.htp.lessons.leson13streem;

public class OperatorInspector{
    public static void main(String[] args) throws InterruptedException {
    Account account = new Account(200);
    OperatorDeposit opD = new OperatorDeposit(account);
    OperatorWithdraw opW = new OperatorWithdraw(account);
    opD.start();
    opW.start();
    opD.join();
    opW.join();
        System.out.println(account.getBalance());

        // 3 methods to synchronize
        //synchronized() method
        //synchronized() block
        //Lock lock = new ReentrantLock();
    }
}

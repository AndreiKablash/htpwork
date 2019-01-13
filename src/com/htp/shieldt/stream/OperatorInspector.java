package com.htp.shieldt.stream;

public class OperatorInspector {
    public static void main(String[] args) throws InterruptedException{
        Account account = new Account(200);
        OperatorWithdraw opW = new OperatorWithdraw(account);
        OperatorDeposit opD = new OperatorDeposit(account);
        opD.start();
        opW.start();

        opW.join();
        opD.join();
        System.out.println(account.getBalance());
    }
}

package com.htp.shieldt.stream;

public class OperatorWithdraw extends Thread{
    private Account account;
    public OperatorWithdraw(Account account){
        this.account =account;
    }
    public void run(){
        for(int i=0; i<5;i++){
            synchronized(account){
                account.withdraw(50);
            }
        }
    }
}

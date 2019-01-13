package com.htp.lessons.leson13streem;

public class Walk implements Runnable{
    public void run(){
        for(int i = 0;i<8; i++){
            System.out.println("Walking");
            try{
                Thread.sleep(400);
            }catch(InterruptedException ex){
                System.err.print(ex);
            }
        }
    }

}

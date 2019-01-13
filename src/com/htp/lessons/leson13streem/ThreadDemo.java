package com.htp.lessons.leson13streem;

public class ThreadDemo {
    public static void main(String[] args) {
       /* try{

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());

       // ThreadGroup firstThreadGroup = new ThreadGroup();
        //firstThreadGroup.
        //Thread.sleep(12000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }*/
        //new stream objects (two methods)
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        //stream start
        talk.start();
        walk.start();
        //Walk walk1 = new Walk();//просто объект, не поток
        //walk1.run(); //выполняется метод, но поток не запуститься!
    }
}

package com.htp.shieldt.synchronize.concurrentSinchronization.semaphore;

import java.util.concurrent.Semaphore;

public class Parking {
    /*true - парковочное место занято, false - парковочное место свободко*/
    private static final boolean[] PARKING_PLACES = new boolean[5];
    private static final Semaphore SEMAPHORE = new Semaphore(5,true);

    public static void main(String[] args) throws InterruptedException {
        for(int i=1; i<=7;i++){
            new Thread(new Car(i)).start();
            Thread.sleep(400);
        }
    }
    public static class Car implements Runnable{
        private int carNumber;

        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            System.out.println("Автомобиль №" + carNumber + " подъехал к парковке");
            try {
                SEMAPHORE.acquire();
                int parkingNaumber = -1;
                synchronized (PARKING_PLACES){
                    for(int i=0;i<5;i++)
                        if(!PARKING_PLACES[i]){
                            PARKING_PLACES[i]=true;
                            parkingNaumber=i;
                            System.out.println("Автомобиль №" + carNumber
                                    + " припарковался на парковочном месте №" + i);
                            break;
                        }
                }
                    Thread.sleep(5000);//ушел за покупками
                    synchronized (PARKING_PLACES){
                        PARKING_PLACES[parkingNaumber]=false; //освобождает место
                    }
                        SEMAPHORE.release(); //освобождает ресурс
                        System.out.println("Автомобиль №"+carNumber+" покинул парковку");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

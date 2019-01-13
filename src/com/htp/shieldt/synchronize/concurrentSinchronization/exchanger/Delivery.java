package com.htp.shieldt.synchronize.concurrentSinchronization.exchanger;

import java.util.concurrent.Exchanger;

public class Delivery {
    private static Exchanger<String> EXCHANGER = new Exchanger<>();

    public static void main(String[] args) throws InterruptedException{
        String[] p1 = new String[]{"{посылка A->D}", "{посылка A->C}"};//Формируем груз для 1-го грузовика
        String[] p2 = new String[]{"{посылка B->C}", "{посылка B->D}"};//Формируем груз для 2-го грузовика

        new Thread(new Truck(1,"A","D",p1)).start();
        Thread.sleep(400);
        new Thread(new Truck(2,"B","C",p2)).start();
    }

    public static class Truck implements Runnable{
        private int truckNumber;
        private String depature;
        private String destination;
        private String[] parcels;

        public Truck(int truckNumber, String depature, String destination, String[] parcels) {
            this.truckNumber = truckNumber;
            this.depature = depature;
            this.destination = destination;
            this.parcels = parcels;
        }

        @Override
        public void run() {
            try{
                System.out.printf("В грузовик №%d погрузили: %s и %s.\n", truckNumber, parcels[0], parcels[1]);
                System.out.printf("Грузовик №%d выехал из пункта %s в пункт %s.\n", truckNumber, depature, destination);
                Thread.sleep(1000+(long)Math.random()*500);
                System.out.printf("Грузовик №%d приехал в пункт Е.\n", truckNumber);
                parcels[1] = EXCHANGER.exchange(parcels[1]);
                //При вызове exchange() поток блокируется и ждет
                //пока другой поток вызовет exchange(), после этого произойдет обмен посылками
                System.out.printf("В грузовик №%d переместили посылку для пункта %s.\n", truckNumber, destination);
                Thread.sleep(1000 + (long) Math.random() * 5000);
                System.out.printf("Грузовик №%d приехал в %s и доставил: %s и %s.\n", truckNumber, destination,
                        parcels[0], parcels[1]);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

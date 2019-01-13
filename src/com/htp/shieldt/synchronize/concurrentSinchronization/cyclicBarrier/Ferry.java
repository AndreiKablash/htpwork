package com.htp.shieldt.synchronize.concurrentSinchronization.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Ferry {
    private static final CyclicBarrier BARRIER = new CyclicBarrier(3, new FerryBoat());

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 9; i++) {
            new Thread(new Car(i)).start();
            Thread.sleep(400);
        }
    }

    //Таск, который будет выполняться при достижении сторон(автомобилей) барьера
    public static class FerryBoat implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println("Паром переправил автомобили!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Стороны, которые будут достигать барьера
    public static class Car implements Runnable {
        private int carNumber;

        public Car() {
        }

        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        public int getCarNumber() {
            return carNumber;
        }

        @Override
        public void run() {
            try {
                System.out.println("Автомобиль №" + carNumber + " подъехал к паромной переправе");
                //Для указания потоку о том что он достиг барьера, нужно вызвать метод await()
                //После этого данный поток блокируется, и ждет пока остальные стороны достигнут барьераBa
                BARRIER.await();
                System.out.println("Автомобиль №" + carNumber + "продолжил движение");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

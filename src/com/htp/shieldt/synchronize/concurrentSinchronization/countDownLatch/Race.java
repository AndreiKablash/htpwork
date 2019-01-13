package com.htp.shieldt.synchronize.concurrentSinchronization.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Race {
    //создаем CountDownLatch на 8 условий.
    private static final CountDownLatch START = new CountDownLatch(8);
    //условная длина гоночной трассы
    private static final int TRACK_LENGTH= 500000;

    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=5;i++){
            new Thread(new Car(i,(int)(Math.random()*100+50))).start();
            Thread.sleep(1000);
        }
        while(START.getCount()>3){
            Thread.sleep(100);//Проверяем. собрались ли все автомобили у стартовой линии,
            //если нет, то ожидаем 100
        }
        Thread.sleep(1000);
        System.out.println("На страрт");
        START.countDown(); //уменьшить счетчик на -1
        Thread.sleep(1000);
        System.out.println("Внимание");
        START.countDown(); //уменьшить счетчик на -1
        Thread.sleep(1000);
        System.out.println("Марш");//уменьшить счетчик на -1
        START.countDown();//счетчик равено 0, все потоки разблокируются одновременно
    }
    public static class Car implements Runnable{
        private int carNumber;
        private int carSpeed;

        public Car(int carNumber, int carSpeed) {
            this.carNumber = carNumber;
            this.carSpeed = carSpeed;
        }
        @Override
        public void run(){
            try {
                System.out.println("Автомобиль№" + carNumber + " подъехал в стартовой линии");
                //Автомобиль плдъехал к стартовой прямой, условие вполнено.
                //Уменьшаем счетсик на -1
                START.countDown();
                //await блокирует поток, вызваший его до тех пор, пока счетчик не станет равен 0
                START.await();
                Thread.sleep(TRACK_LENGTH/carSpeed);
                System.out.println("Автомобиль №"+carNumber+" финишировал");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

package com.htp.tasks.Garage;

public class Car {
    public static void main(String[] args) {
        //Build first car
        CarBuild firstCar = new CarBuild ();
        String car1 = firstCar.carBuilder("Mercedes ", "GLS200");
        System.out.println("Первый автомобиль: " + car1);
        CarSum firstCarSum = new CarSum();
        int car1sum=firstCarSum.carSumMet(12,23,0,3,45,5 );
        System.out.println("Стоимость первого автомобиля: "+car1sum);

        Machine machine=new Machine();
        machine.setEngine(30);
        machine.setBody(67);
        int a = machine.getEngine();
        int b = machine.getWheel();
        int c = machine.getBody();
        int d = machine.getWindshild();
        int e = machine.getGearbox();
        int f = machine.getRearSplashes();
        int g = machine.getSpoiler();
        String h=machine.getMachine();
        String i=machine.getModel();

        //Build second car
        CarBuild secondCar=new CarBuild();
        String car2=secondCar.carBuilder(h,i);
        System.out.println("Второй автомобиль: " + car2);
       /* CarSum secondCarSum=new CarSum();
        int car2sum=secondCarSum.carSumMet();*/
        int car2sum = CarSum.carSumMet(a,b,c,d,e,f,g);
        System.out.println("Стоимость второго автомобиля: "+ car2sum);
    }
}

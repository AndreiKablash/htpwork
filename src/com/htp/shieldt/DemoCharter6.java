package com.htp.shieldt;

public class DemoCharter6 {

    public static void main(String[] args) {
        //создание посылки (box)
        Charter6 charter6 = new Charter6(100,100,100);
        Charter6 charter61 =new Charter6();
        Charter6 charter62 = new Charter6(100.0);
        Charter6 myclone=new Charter6(charter6);
        //Добавление веса
        BoxWeigth boxWeigth1=new BoxWeigth(10,20,30,11.2);
        BoxWeigth boxWeigth2=new BoxWeigth();
        BoxWeigth boxWeigth3=new BoxWeigth(10,23.4);
        BoxWeigth boxWeigth4=new BoxWeigth(boxWeigth1);
        //Добавление стоимости посылки
        Shipment shipment1=new Shipment(10,10,20,3.5,15);
        Shipment shipment2=new Shipment(10, 3.1,11);
        double volume;
        double volbox;
        double volship;
        /*//присваиваем значения переменным charter6
        charter6.weigth=100;
        charter6.depth=80;
        charter6.length=80;
        //присваиваем значения переменным charter6
        charter61.weigth=20;
        charter61.length=20;
        charter61.depth=20;*/
        //инициализация каждого экзепляра Box
        volume=charter6.volume();
        System.out.println(volume);
        volume=charter61.volume();
        System.out.println(volume);
        volume=charter62.volume();
        System.out.println(volume);
        volume=myclone.volume();
        System.out.println(volume);
        System.out.println("-----------");
        volbox=boxWeigth1.volume();
        System.out.println("boxweigth1 = " + volbox);
        System.out.println("boxweigth1.weigth = " + boxWeigth1.wigth);
        volbox=boxWeigth2.volume();
        System.out.println("boxweigth2 = " + volbox);
        System.out.println("boxweigth2.weigth = " + boxWeigth2.wigth);
        System.out.println(" ");
        volbox=boxWeigth3.volume();
        System.out.println("boxweigth3 = " + volbox);
        System.out.println("boxweigth3.weigth = " + boxWeigth3.wigth);
        System.out.println(" ");
        volbox=boxWeigth4.volume();
        System.out.println("boxweigth4 = " + volbox);
        System.out.println("boxweigth4.weigth = " + boxWeigth4.wigth);
        System.out.println(" ");
        charter61=boxWeigth1;
        volume = charter61.volume();
        System.out.println(volume);

        volship=shipment1.volume();
        System.out.println("shipment1 = " + volship);
        System.out.println("shipment1.wigth = " + shipment1.wigth);
        System.out.println("shipment1.cost = " + shipment1.cost);
        System.out.println(" ");
        volship=shipment2.volume();
        System.out.println("shipment2 = " + volship);
        System.out.println("shipment2.wigth = " + shipment2.wigth);
        System.out.println("shipment2.cost = " + shipment2.cost);
        System.out.println(" ");

    }
}

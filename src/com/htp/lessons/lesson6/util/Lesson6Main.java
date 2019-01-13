package com.htp.lessons.lesson6.util;

import com.htp.lessons.lesson6.domain.OurTestEnum;

public class Lesson6Main{
    public static void main(String[] args) {
       // Lesson6Generic<Object,Object>
    Lesson6Generic<Number,Object>temp = new Lesson6Generic<>();//diamand operator

    System.out.println(temp.getId() + " :"+temp.getValue());
    Lesson6Generic<Long, String>genericTest = new Lesson6Generic<>(1L,"GenericTest");
    System.out.println(genericTest.getId()+" : "+ genericTest.getValue());

    //Lesson6Generic<Boolean, Double> var = new Lesson6Generic<>(true, 4.5);
      //  System.out.println(var.getId()+" : " + var.getValue());

        //genericTest.genericMethod(1L);

        //genericTest.genericMethod(228L);

//       genericTest.genericMethod(new Lesson6Generic<Number,Object>());
  //      System.out.println(new Integer(123).byteValue());

       // GenericMethod.someGeneric(1, new Object());
        //GenericMethod.someGeneric(2.2, new Object());

        //enum
        System.out.println("Enum");
        System.out.println(OurTestEnum.EAST);
        System.out.println(OurTestEnum.WEST.name());
        System.out.println(OurTestEnum.SOUTH.ordinal());
        System.out.println(OurTestEnum.NORTH);

        System.out.println(OurTestEnum.NORTH.isNorth());
        System.out.println(OurTestEnum.SOUTH.getGlobalSide());

    //1.создать абстрактный класс который будет дженериком
    // 2.Унаследоваться от этого класса
    //3.Заимплементить 2 интерфейса
    //4. Создать свой энам и использовать его как поле класса
    //5.Уровней иерархии 2 (на одном уровне 4 объекта)
    // 6. енаме создать метод по аналогии
    }
}

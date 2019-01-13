package com.htp.lessons.lesson123;

public class HomeWork {
    public static final double G = 9.8; // symbol for gravitational acceleration, m2/c

    public static void main(String[] args) {
        //Task1
        double bodyMass = 67; // Your body mass, kg
        double weightOnEarth = G * bodyMass; // weight or gravity on Earth, N
        double weightOnMoon = weightOnEarth * 16 / 100; // weight or gravity on the Moon, N
        System.out.println("Your weigth on Earth - " + weightOnEarth + ", N");
        System.out.println("Your weigth on the Moon - " + weightOnMoon + ", N");


        //Task2

        double mass[]={1,2,3,4,5,6};
        for(int i=0;i<mass.length;i++){
            mass[i]+=mass[i]*10/100;
            System.out.print(mass[i] + " ");
        }

        //Task3

        int x = 12321;
        int x1 = x;
        int x2 = 0;
        while (x / 1 != 0) {
            x2 *=10;
            x2 += x % 10;
            x /=10;
        }
        if(x1==x2){
        System.out.println("Your number is polindrome" );}
        else
        System.out.println("Your number isn't polindrome" );



        //Task4
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        //Task5
        for (int j = 1; j <= 15; j++) {
            if (j % 2 != 0)
                System.out.print(j + " ");
            }

        //Task6
        int firstValue = 1;
        int lastValue = 100;
        for (int k = firstValue; k <= lastValue; k++) {
            if ((k & 1) == 0)
                System.out.print(k + " ");
        }

        //Task7
        int firstValue1 = 1;
        int lastValue1 = 100;
        int count = 0;
        for (int k = firstValue1; k <= lastValue1; k++) {
            count++;
        }
        System.out.print(count);

        //Task8
        for(int i=1;i<=12;i++){
            if(i ==1) System.out.println("number "+i+" January" );
            else if(i==2) System.out.println("number "+i+" February" );
            else if(i==3) System.out.println("number "+i+" March" );
            else if(i==4) System.out.println("number "+i+" April" );
            else if(i==5) System.out.println("number "+i+" May" );
            else if(i==6) System.out.println("number "+i+" June" );
            else if(i==7) System.out.println("number "+i+" July" );
            else if(i==8) System.out.println("number "+i+" August" );
            else if(i==9) System.out.println("number "+i+" September" );
            else if(i==10) System.out.println("number "+i+" October" );
            else if(i==11) System.out.println("number "+i+" November" );
            else if(i==12) System.out.println("number "+i+" December" );
        }

        //Task9
        int value1 = 1;
        int value2 = 3;
        int glass = 0;

        glass = value1;
        value1 = value2;
        value2 = glass;
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);


        //Task10
        int value1s = 3;
        int value2s = 4;
        int sum = value1s + value2s;
        System.out.println("sum = " + sum);

            //Task11
        int number1 = 10;
        int number2 = 5;
        int number3 = 13;

        if(number1>number2) {
            if (number1 > number3) {
                System.out.println("Max value is number1: " + number1); }
            else {
                System.out.println("Max value is number3: " + number3); }
        }
        else{
            if(number2>number3){
                System.out.println("Max value is number2: " + number2);}
            else{
                System.out.println("Max value is number3: " + number3);}
        }

/*
            //Task11 (part2 for case number1=number2=number3)
            int numberb1 = 1;
            int numberb2 = 11;
            int numberb3 = 11;

            //all numbers are equal

            if (numberb1 == numberb2 && numberb2 == numberb3) {
                System.out.println("all numbers are equal: number1= number2= number3: " + number1);
                return;
            }


            //check for equal numbers

            if (number2 == number1) {
                if (number2 > number3)
                    System.out.println("Max value is number1 and number2: " + number1);
                else
                    System.out.println("Max value is number3: " + number3);
            }

            if (number1 == number3) {
                if (number1 > number2)
                    System.out.println("Max value is number1 and number3: " + number1);
                else
                    System.out.println("Max value is number2: " + number2);
            }

            if (number2 == number3) {
                if (number2 > number1)
                    System.out.println("Max value is number2 and number3: " + number2);
                else
                    System.out.println("Max value is number2: " + number1);
            }

            //all numbers are different
            if (number2 != number1 && number3 != number1 && number2 != number3) {

                if (number1 > number2) {
                    if (number1 > number3) {
                        System.out.println("Max value is number1: " + number1);
                    } else {
                        System.out.println("Max value is number3: " + number3);
                    }
                } else {
                    if (number2 > number3) {
                        System.out.println("Max value is number2: " + number2);
                    } else {
                        System.out.println("Max value is number3: " + number3);
                    }
                }

            }


        }*/

        //Task12
        int  a=4, b=1;
        boolean m = (a<b);
        boolean n= ((a-b)>0);
        if (m)
            System.out.println("m= " + true);
        else
            System.out.println("m= " + false);
        if(n)
            System.out.println("n= " + true);
        else
            System.out.println("n= " + false);


        //Task13

        String stroka1= "Hello";
        String stroka2= " java!";
        System.out.println(stroka1+stroka2);
        System.out.println(stroka1.concat(stroka2));


        //Task14
        int numberA = 13;
        int numberB = 12;

        if (numberA > numberB) {
            System.out.println("numberA= " + (numberA + 3));
        } else
            System.out.println("numberB= " + (numberB + 8));


        //Task15

            //from 1 to 100 by the use of for

            for(int e=1;e<=100;e++)
                System.out.println(e + " ");

            //from 1 to 100 by the ase of while
            int e=1;
                while(e<=100) {
                    System.out.print(e + " ");
                    e++;


                    //from 1 to 100 by the ase of do while
                    int y = 0;
                    do {
                        System.out.print(y + " ");
                        y++;
                    }
                    while (y <= 100);


                    // Task17


                }
    }
}

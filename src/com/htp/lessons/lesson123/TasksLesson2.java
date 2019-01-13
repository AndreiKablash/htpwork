package com.htp.lessons.lesson123;

import java.util.Arrays;

public class TasksLesson2 {
    public static void main(String[] args) {

        //Task1
        //sort with arrays class
        String stroka[] = {"right", "Home", "hp", "cinema"};
        Arrays.sort(stroka);
        for(int k=0;k<stroka.length;k++) {
            System.out.println(stroka[k]);
        }
        /*//sort with bubble
        for(int i=0;i<stroka.length;i++){
            for(int j=0;j<stroka.length-1;i--){
                if()

                }
            }
        }
*/
        //Task2
        int [] myArray = {2,1,3,4,5};
        int count =0;
        for(int i=0;i<myArray.length;i++){
            count+=myArray[i];
        }
        System.out.println(count);

        //Task3
        char[] myCharArray = new char[10];
        for(int i=0;i<(myCharArray.length-5);i++){
            System.out.println(" ");
            for (int j=0;j<myCharArray.length;j++){
                myCharArray[j]='-';
                System.out.print(myCharArray[j]);
            }
        }
        System.out.println();

        //Task4
        int [] myArray1 = {2,1,3,4,5};
        int middleValue =0;
        int sum = 0;
        for(int  i=0;i<myArray1.length;i++){
            sum+=myArray1[i];
        }
        middleValue =sum/myArray1.length;
        System.out.println("middleValue = " + middleValue);

        //Innitialization 2D
        double mark[][]={
                {1,2,3,4},
                {2,3,4,1},
                {3,2,1,3}
        } ;

        int i, j;
        for(i=0;i<mark.length;i++){
            for(j=0;j<mark[i].length;j++)
                System.out.print(mark[i][j]);
                System.out.println();
        }
        System.out.println();


        //sample 3D

        int threeD[][][] = new int[3][4][5];

        for(i=0;i<threeD.length;i++) {
            for (j = 0; j<threeD[i].length;j++){
                for (int k = 0; k < threeD[i][j].length; k++){
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        for(i=0;i<threeD.length;i++) {
            for (j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++)
                    System.out.print(threeD[i][j][k] + " ");
                    System.out.println();
            }
            System.out.println();
        }

        //arrays sort
        //перебор
        System.out.println("перебор");
        int num[]={2,7,4,5,6,9,1,3,8};
        for (i=0;i<num.length;i++){
            int min = i;
            for(j=i+1;j<num.length;j++){
                if(num[min]>num[j]){
                   min = j;
                }
            }
                int tmp = num[min];
                num[min]=num[i];
                num[i]=tmp;
                System.out.print(num[i] + " ");
        }
        System.out.println();

        //пузырек
        System.out.println("Пузырек");

        for(i=0;i<num.length;i++){
            for(j=0;j<num.length-1;j++){
                if (num[j] > num[j+1]) {
                    int tmp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tmp;
                }
            }
            System.out.print(num[i]+ " ");
        }
        System.out.println();

        //Arrays.sort
        System.out.println("Arrays.sort");

        Arrays.sort(num);
        for(i = 0; i <  num.length; i++) {
            System.out.print(num[i] + "  ");
        }
        //string sort
        System.out.println();
        System.out.println("String:");

        String names[]={"Anna","Sam","Pitter","Anton"};
        Arrays.sort(names);
        for(i=0;i<names.length;i++){
            System.out.print(names[i]+ " ");
        }









    }
}

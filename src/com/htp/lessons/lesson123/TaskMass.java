package com.htp.lessons.lesson123;
import java.util.*;

public class TaskMass {
    public static void main(String[] args) {

      // input from keyboard

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int inputFirstV = scanner.nextInt();
        System.out.print("Enter last value: ");
        int inputLastV = scanner.nextInt();
        System.out.print("Enter step value: ");
        int inputStepV = scanner.nextInt();

        System.out.println("Your data array");

        //calculate the size of data array
        int size=(inputLastV-inputFirstV)/inputStepV+1;
        //create data array
        int massive[]=new int[size];
        for(int i=0; i<size;i++) {
            massive[i] = inputFirstV + inputStepV * i;/*complete data array*/
            System.out.print(massive[i] + "  "); /*display output of data array*/
        }




    }
}
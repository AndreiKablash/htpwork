package com.htp.lessons.lesson123;

public class AdvancedLesson1 {
    //2.	Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток

    public static void main(String[] args) {
        int twentyFourHours = 7;
        System.out.println("twentyFourHours= " + twentyFourHours);
        int hours = twentyFourHours*24;
        System.out.println("hours= " + hours);
        int minutes = hours*60;
        System.out.println("minutes= "+ minutes);
        int seconds = minutes*60;
        System.out.println("seconds = " + seconds);

    }
}

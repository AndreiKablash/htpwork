package com.htp.lessons.lesson123;

public class Task18 {

    public static void convertRuToUsd(double roubles,double rate){
        double dollars =roubles/rate;
        System.out.println("Your amount of dollars = " + dollars + " Usd");
    }
    public static void main(String[] args) {
        double rate = 2.1100 ;
        double roubles = 211;
        convertRuToUsd(roubles,rate );
    }

}

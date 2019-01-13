package com.htp.tasks.Garage;

public class CarSum {
    public static int carSumMet(int engine, int wheel, int body, int windshild, int gearbox, int rearSplashes){
        return engine+wheel+body+windshild+gearbox+rearSplashes;
    }
    public static double carSumMet(double engine, double wheel, double body, double windshild, double gearbox){
        return engine+wheel+body+windshild+gearbox;
    }
    public static int carSumMet(int engine, int wheel, int body,int gearbox,int spoiler){
        return engine+wheel+body+gearbox+spoiler;
    }
    public static int carSumMet(int engine, int wheel, int body, int windshild, int gearbox, int rearSplashes, int spoiler){
        return engine+wheel+body+windshild+gearbox+rearSplashes+spoiler;
    }
}

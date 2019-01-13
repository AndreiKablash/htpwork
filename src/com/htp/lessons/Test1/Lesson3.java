package com.htp.lessons.Test1;

public class Lesson3 {
    // Code convension
    //final class - нельзя наследоваться
    //public final int constant = 10;

    public static final String CONSTANT_STRING = "EPTY";

    //статика
    public static int A=0;

    //default constructor
    public Lesson3() {
    }

    public Lesson3(int a) {
        // constant = 10; - нельзя инициализировать!
    }

    //another constructor
    public Lesson3(int a, String b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    //перегрузка
    //1.методы в одного класса
    //2.методы называются одинаково
    //3.разная сигнатура методов (...)

    public int a = 10;//паблик доступ (везде доступен)
    private String b = " string";//только в классе
    protected int c = 8;//только внутри пакета, только у наследников
    private int d = 9;
    private boolean bool;
    private String anotherTestString;

    //структура метода
    //модификатор доступа| static or not static|тип возвращаемого значение
    //перегрузка методов
    public int calcOutVars(int first, int second, int third) {
        return first + second + third;
    }

    public double calcOutVars(double first, double second, double third){
        return first+second+third;
    }
    /*public int calcOutVars(int first, int second, int third) {
        return (first + second + third)*2;
    }
    public double calcOutVars(double first, double second, double third){
        return (first+second+third)*3;
    }
    */

    //getter
    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }
    //статика
    public void setA(){
        this.a = a*A;
    }


}

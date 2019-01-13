package com.htp.shieldt;
abstract class Figure{
    double dim1;
    double dim2;

    public Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }
    abstract double areas();
}
class Rectangle extends Figure{
    public Rectangle(double a, double b) {
        super(a, b);
    }
    @Override
    double areas() {
        return dim1*dim2;
    }
}
class Triagle extends Rectangle{
    public Triagle(double a, double b) {
        super(a, b);
    }
    @Override
    double areas() {
        return dim1*dim2/2;
    }
}
public class FindAreas {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(15,15);
        Triagle triagle=new Triagle(20,20);
        Figure figuref;

        figuref=rectangle;
        System.out.println("Square = " + figuref.areas());
        figuref=triagle;
        System.out.println("Square = " + figuref.areas());
    }
}

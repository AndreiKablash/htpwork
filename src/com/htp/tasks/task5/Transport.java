package com.htp.tasks.task5;

public class Transport implements SecondInterface, ThirdInterface {
    private String color;
    private String brand;

    public Transport() {
    }

    public Transport(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public String getBand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBand(String band) {
        this.brand = band;
    }

    @Override
    public Integer toFullTank() {
        return 10;
    }

    @Override
    public Integer carMove() {
        return (int) Math.random() * 10;
    }

    @Override
    public double carStop() {
        return 1;
    }
}

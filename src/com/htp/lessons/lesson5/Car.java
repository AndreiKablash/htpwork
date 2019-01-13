package com.htp.lessons.lesson5;

import java.util.Comparator;

public class Car implements Comparator {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }


    public Integer compare(Car o1, Car o2) {
        if (o1.getCarName().length() > o2.getCarName().length()) {
            return 1;
        } else {
            if(o1.getCarName().length()==o2.getCarName().length()){
                return 1;}
                else return 0;
            }
        }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}


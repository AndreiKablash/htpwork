package com.htp.tasks.task5;

import java.util.Comparator;

public class CarCompare implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getColor().length() > o2.getColor().length()) {
            return 1;
        }
        else {
            if(o1.getColor().length()==o2.getColor().length()){
                return 0;}
            else return -1;
        }
    }
}

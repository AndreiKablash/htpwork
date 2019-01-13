package com.htp.tasks.task5;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Car> carComparator = new CarCompare();
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("blue", "BMW", "535"));
        cars.add(new Car("red", "Mitsubishi", "Lancer"));
        cars.add(new Car("red", "Renault", "Logan"));
        cars.add(new Car("blue", "Renault", "Megan"));
        cars.sort(carComparator);
        cars.forEach(System.out::println);

    }
}

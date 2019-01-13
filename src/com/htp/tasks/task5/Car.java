package com.htp.tasks.task5;

import java.util.Objects;

public class Car extends Transport {
    private String model;

    public Car() {
    }

    public Car(String color, String brand, String model) {
        super(color, brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "Car{" + "color='" + getColor() + '\'' + "brand='" + getBand() + '\'' +
                "model='" + model + '\'' +
                '}';
    }
}



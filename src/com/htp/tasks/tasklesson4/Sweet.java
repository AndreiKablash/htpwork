package com.htp.tasks.tasklesson4;

import java.util.Objects;

public class Sweet {
    private String sweetKind;
    private String sweetName;
    private int weight;

    public Sweet(){
    }

    public Sweet(String sweetKind, String sweetName, int weight) {
        this.sweetKind = sweetKind;
        this.sweetName = sweetName;
        this.weight = weight;
    }

    public String getSweetKind() {
        return sweetKind;
    }

    public String getSweetName() {
        return sweetName;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return weight == sweet.weight &&
                Objects.equals(sweetKind, sweet.sweetKind) &&
                Objects.equals(sweetName, sweet.sweetName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(sweetKind, sweetName, weight);
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "sweetKind='" + sweetKind + '\'' +
                ", sweetName='" + sweetName + '\'' +
                ", weight=" + weight +
                '}';
    }
}

package com.htp.shieldt.compareListObjects;

import java.util.Objects;

public class Volunteer {
    private String name;
    private String surName;
    private String iD;

    public Volunteer() {
    }

    public Volunteer(String name, String surName, String iD) {
        this.name = name;
        this.surName = surName;
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getiD() {
        return iD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volunteer volunteer = (Volunteer) o;
        return Objects.equals(name, volunteer.name) &&
                Objects.equals(surName, volunteer.surName) &&
                Objects.equals(iD, volunteer.iD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, iD);
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", iD='" + iD + '\'' +
                '}';
    }
}

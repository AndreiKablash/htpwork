package com.htp.shieldt.compareListObjects;

import java.util.Objects;

public class Student {
    private String name;
    private String surName;
    private String iD;

    public Student() {
    }

    public Student(String name, String surName, String iD) {
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
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(surName, student.surName) &&
                Objects.equals(iD, student.iD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, iD);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", iD='" + iD + '\'' +
                '}';
    }
}

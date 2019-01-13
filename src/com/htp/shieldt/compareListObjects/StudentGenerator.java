package com.htp.shieldt.compareListObjects;

public class StudentGenerator {
    public static Student generate(String name, String surname, String iD){
        return new Student(name,surname,iD);
    }
}

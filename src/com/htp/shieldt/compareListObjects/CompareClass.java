package com.htp.shieldt.compareListObjects;

import java.util.Collection;
import java.util.Objects;

public class CompareClass {
    public void areEqual(Collection<Student> studentCollection, Collection<Volunteer> volunteerCollection) {
        if (studentCollection.size() != volunteerCollection.size()) {
            System.out.println("The size of collections is different");
        }
        for (Student a : studentCollection) {
            for (Volunteer b : volunteerCollection) {
                if (Objects.equals(a.getName(), b.getName()) && Objects.equals(a.getSurName(), b.getSurName())
                        && Objects.equals(a.getiD(), b.getiD())) {
                    System.out.println(a + "element of collections Student EQUALS" + b + " of collection Volunteer");
                } else {
                    System.out.println(a + "element of collections Student NOT EQUALS" + b + " of collection Volunteer");
                }
            }
        }
    }
}

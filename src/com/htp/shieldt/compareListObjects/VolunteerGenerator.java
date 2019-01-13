package com.htp.shieldt.compareListObjects;

public class VolunteerGenerator {
    public static Volunteer generate(String name, String surname, String iD){
        return new Volunteer(name,surname,iD);
    }
}

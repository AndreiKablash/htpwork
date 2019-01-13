package com.htp.shieldt.compareListObjects;

import java.util.LinkedList;

public class Comparison {
    public static void main(String[] args) {

        //Task 1
        LinkedList<Student> lirstOfStudents = new LinkedList<Student>();
        lirstOfStudents.add(StudentGenerator.generate("Andrei", "Kirilov","MP0123233"));
        lirstOfStudents.add(StudentGenerator.generate("Sergei","Alekseev","MN0221212"));
        lirstOfStudents.add(StudentGenerator.generate("Ivan","Supranovich","MK1298120"));
        lirstOfStudents.add(StudentGenerator.generate("Irina","Cruise","MN96547523"));
        lirstOfStudents.add(StudentGenerator.generate("Tom","Cruise","NN23347675"));
        lirstOfStudents.add(StudentGenerator.generate("Jerry","Gear","AN45476727"));

        LinkedList<Volunteer> listOfVolunteer = new LinkedList<Volunteer>();
        listOfVolunteer.add(VolunteerGenerator.generate("Andrei", "Kirilov","MP0123233"));
        listOfVolunteer.add(VolunteerGenerator.generate("Sergei","Alekseev","MN0221212"));
        listOfVolunteer.add(VolunteerGenerator.generate("Tomas","Ivanou","MK1298120"));
        listOfVolunteer.add(VolunteerGenerator.generate("Irina","Cruise","MN96547523"));
        listOfVolunteer.add(VolunteerGenerator.generate("Tom","Cruise","NN23347675"));
        listOfVolunteer.add(VolunteerGenerator.generate("Jerry","Holland","IN46473987"));

      // LinkedList<String> crossNamesList = new LinkedList<>();

        CompareClass compare = new CompareClass();
        compare.areEqual(lirstOfStudents, listOfVolunteer);


    }
}

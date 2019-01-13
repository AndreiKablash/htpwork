package com.htp.shieldt.workWithXMLFiles;

import java.util.Objects;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String location;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, String location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(location, employee.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, location);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "(" + id + ")" + location;
    }
}
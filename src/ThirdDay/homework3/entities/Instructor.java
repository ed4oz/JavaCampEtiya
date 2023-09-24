package ThirdDay.homework3.entities;

public class Instructor {
    private int id;
    private String firstName;
    private String lastName;

    public Instructor() {
    }

    public Instructor(int id, String name, String surName) {
        this.id = id;
        this.firstName = name;
        this.lastName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

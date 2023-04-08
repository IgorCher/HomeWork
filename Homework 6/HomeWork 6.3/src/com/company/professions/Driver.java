package com.company.professions;

public class Driver {
    private String name;
    private String surname;
    private int experience;

    public Driver(String name, String surname, int experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExperience() {
        return experience;
    }
}

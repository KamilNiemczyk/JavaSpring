package com.example.demo.domain;

public class Person {
    final private String id;
    final private String firstName;
    final private String lastName;
    final private String email;
    final private int yearOfBirth;

    public Person(String id, String firstName, String lastName, String email, int yearOfBirth){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString(){
        return "Person " +
                "id='" + id +
                ", firstName='" + firstName +
                ", lastName='" + lastName +
                ", email='" + email  +
                ", yearOfBirth=" + yearOfBirth +
                ". ";
    }
}

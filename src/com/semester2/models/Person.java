package com.semester2.models;

public class Person {
    private int personNo;
    private String email;
    private String firstName;
    private String lastName;
    private String middleName;

    public Person(int personNo, String email, String firstName, String lastName, String middleName) {
        this.personNo = personNo;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(int personNo, String email, String firstName, String lastName) {
        this.personNo = personNo;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonNo() {
        return personNo;
    }

    public void setPersonNo(int personNo) {
        this.personNo = personNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}

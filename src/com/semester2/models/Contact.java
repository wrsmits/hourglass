package com.semester2.models;

public class Contact extends Person {
    private String phoneNo;

    public Contact(int personNo, String email, String firstName, String lastName, String middleName, String phoneNo) {
        super(personNo, email, firstName, lastName, middleName);
        this.phoneNo = phoneNo;
    }

    public Contact(int personNo, String email, String firstName, String lastName, String phoneNo) {
        super(personNo, email, firstName, lastName);
        this.phoneNo = phoneNo;
    }
}

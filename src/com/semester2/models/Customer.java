package com.semester2.models;

import com.semester2.enumerations.*;

import java.util.ArrayList;

public class Customer {
    private String customerNo;
    private String name;
    private ArrayList<Project> projects;
    private String street;
    private int houseNo;
    private String houseAddition;
    private String postalCode;
    private String city;
    private Country country;
    private Contact contact;
    private String phoneNo;
    private String email;

    public Customer(String customerNo, String name, String street, int houseNo, String postalCode, String city, Country country, String phoneNo, String email) {
        this.customerNo = customerNo;
        this.name = name;
        this.street = street;
        this.houseNo = houseNo;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getHouseAddition() {
        return houseAddition;
    }

    public void setHouseAddition(String houseAddition) {
        this.houseAddition = houseAddition;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

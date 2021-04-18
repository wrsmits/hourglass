package com.semester2.models;

import com.semester2.enumerations.*;

public class User extends Person {
    private String workerId;
    private Department department;
    private Location location;

    public User(int personNo, String email, String firstName, String lastName, String middleName, String workerId, Department department, Location location) {
        super(personNo, email, firstName, lastName, middleName);
        this.workerId = workerId;
        this.department = department;
        this.location = location;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

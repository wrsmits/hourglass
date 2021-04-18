package com.semester2.models;

import com.semester2.enumerations.Department;

public class ProjectLeader extends User {
    private TeamLeader manager;

    public ProjectLeader(int personNo, String email, String firstName, String lastName, String middleName, String workerId, Department department, Location location) {
        super(personNo, email, firstName, lastName, middleName, workerId, department, location);
    }
}

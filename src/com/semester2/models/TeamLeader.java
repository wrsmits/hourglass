package com.semester2.models;

import com.semester2.enumerations.Department;

public class TeamLeader extends User {
    private HourRegistration approvalList;

    public TeamLeader(int personNo, String email, String firstName, String lastName, String middleName, String workerId, Department department, Location location) {
        super(personNo, email, firstName, lastName, middleName, workerId, department, location);
    }
}

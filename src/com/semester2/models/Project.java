package com.semester2.models;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String projectId;
    private String description;
    private ArrayList<Task> tasks;
    private Date startDate;
    private Date endDate;
    private Note note;
    private ProjectLeader projectLeader;
    private ArrayList<Employee> workers;
}

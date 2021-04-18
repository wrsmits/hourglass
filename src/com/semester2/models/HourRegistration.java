package com.semester2.models;

import java.util.Date;

public class HourRegistration {
    private int id;
    private User worker;
    private Date startTime;
    private Date endTime;
    private Note note;
    private Location startLocation;
    private Location endLocation;
    private boolean approvedByPL;
    private boolean approvedByTL;
    private String approvalMessage;

    public HourRegistration(int id, User worker, Date startTime, Date endTime, Note note, Location startLocation, Location endLocation) {
        this.id = id;
        this.worker = worker;
        this.startTime = startTime;
        this.endTime = endTime;
        this.note = note;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }
}



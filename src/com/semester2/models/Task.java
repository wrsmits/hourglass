package com.semester2.models;

import com.semester2.enumerations.*;

import java.util.ArrayList;
import java.util.Date;

public class Task {
    private String activityId;
    private ArrayList<HourRegistration> hours;
    private String description;
    private ArrayList<User> workers;
    private boolean active;
    private CallStatus callStatus;
    private CallType callType;
    private Absence absenceType;
    private Date plannedDate;
    private double plannedDuration;
    private int finishedPercentage;
    private Note note;

    public Task(String activityId, String description, boolean active, CallStatus callStatus, CallType callType, int finishedPercentage) {
        this.activityId = activityId;
        this.description = description;
        this.active = active;
        this.callStatus = callStatus;
        this.callType = callType;
        this.finishedPercentage = finishedPercentage;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCallStatus(CallStatus callStatus) {
        this.callStatus = callStatus;
    }

    public void setCallType(CallType callType) {
        this.callType = callType;
    }

    public void setFinishedPercentage(int finishedPercentage) {
        this.finishedPercentage = finishedPercentage;
    }
}

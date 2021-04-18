package com.semester2.models;

import com.semester2.enumerations.*;

import java.util.Date;

public class Note {
    private NoteType noteType;
    private String note;
    private Date writtenDate;
    private Person to;
    private Person from;

    public Note(NoteType noteType, String note, Date writtenDate, Person from) {
        this.noteType = noteType;
        this.note = note;
        this.writtenDate = writtenDate;
        this.from = from;
    }
}

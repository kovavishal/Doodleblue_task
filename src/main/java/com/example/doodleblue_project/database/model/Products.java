package com.example.doodleblue_project.database.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Products {
    // room database entity primary key
    @PrimaryKey(autoGenerate = true)
    public int id;
    private String noteTitle;
    private String noteDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }
}

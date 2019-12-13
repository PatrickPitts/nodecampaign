package org.nerdcore.nodecampaign.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class GameNodeNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameNodeNoteID;

    @NotNull
    private int gameNodeID;

    @NotBlank
    @Lob
    private String note;

    private String noteTitle;

    public GameNodeNote() {
    }

    public GameNodeNote(int gameNodeID, String note) {
        this.gameNodeID = gameNodeID;
        this.note = note;
    }

    public int getGameNodeNoteID() {
        return gameNodeNoteID;
    }

    public void setGameNodeNoteID(int gameNodeNoteID) {
        this.gameNodeNoteID = gameNodeNoteID;
    }

    public String getNote() {
        return note;
    }

    public void setNotes(String note) {
        this.note = note;
    }

    public int getGameNodeID() {
        return gameNodeID;
    }

    public void setGameNodeID(int gameNodeID) {
        this.gameNodeID = gameNodeID;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }
}

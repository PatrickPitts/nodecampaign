package org.nerdcore.nodecampaign.models;

import java.util.List;

public class NodeAndNotes {

    GameNode gameNode;
    List<String> notes;
    List<String> noteTypes;

    public NodeAndNotes() {
    }

    public NodeAndNotes(GameNode gameNode, List<String> notes, List<String> noteTypes) {
        this.gameNode = gameNode;
        this.notes = notes;
        this.noteTypes = noteTypes;
    }

    public GameNode getGameNode() {
        return gameNode;
    }

    public List<String> getNoteTypes() {
        return noteTypes;
    }

    public void setNoteTypes(List<String> noteTypes) {
        this.noteTypes = noteTypes;
    }

    public void setGameNode(GameNode gameNode) {
        this.gameNode = gameNode;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }
}

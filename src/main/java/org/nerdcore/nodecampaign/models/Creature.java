package org.nerdcore.nodecampaign.models;

import java.util.ArrayList;

public class Creature {

    private int[] baseStats = {10, 10, 10, 10, 10, 10};
    private ArrayList<String> notes = new ArrayList<>();

    public int[] getBaseStats() {
        return baseStats;
    }

    public void setBaseStats(int[] baseStats) {
        this.baseStats = baseStats;
    }

    public ArrayList<String> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<String> notes) {
        this.notes = notes;
    }

    public void addNotes(String notes){
        this.notes.add(notes);
    }

    public int[] getMods(){
        int[] mods = new int[6];
        for(int i = 0; i < this.baseStats.length; i++){
            mods[i] = (this.baseStats[i] - 10) / 2;
        }
        return mods;
    }
}

package org.nerdcore.nodecampaign.models;

public class QuillSubmission {

    private String text;

    public QuillSubmission() {
    }

    public QuillSubmission(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}

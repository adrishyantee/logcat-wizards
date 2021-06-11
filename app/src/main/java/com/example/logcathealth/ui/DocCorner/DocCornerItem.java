package com.example.logcathealth.ui.DocCorner;

public class DocCornerItem {
    private String doc_name;
    private String doc_ph;
    private String doc_mail;
    private String spec;
    private String available;
    private int author_icon;

    public DocCornerItem(String doc_name, String doc_ph, String doc_mail, String spec, String available, int author_icon) {
        this.doc_mail = doc_mail;
        this.available = available;
        this.doc_ph = doc_ph;
        this.spec = spec;
        this.doc_name = doc_name;
        this.author_icon = author_icon;
    }


    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_ph() {
        return doc_ph;
    }

    public void setDoc_ph(String doc_ph) {
        this.doc_ph = doc_ph;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getDoc_mail() {
        return doc_mail;
    }

    public void setDoc_mail(String doc_mail) {
        this.doc_mail = doc_mail;
    }

    public String getAvailable() {
        return available;
    }
    public void setAvailable(String available) {
        this.available = available;
    }

    public int getAuthor_icon() {
        return author_icon;
    }

    public void setAuthor_icon(int author_icon) {
        this.author_icon = author_icon;
    }
}
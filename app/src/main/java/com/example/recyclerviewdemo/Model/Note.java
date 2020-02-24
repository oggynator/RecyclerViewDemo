package com.example.recyclerviewdemo.Model;

import java.io.Serializable;

public class Note implements Serializable {

    static final long serialVersionUID = 42L;
    private String headline;
    private String description;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Note(String headline, String description) {
        this.headline = headline;
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "headline='" + headline + '\'' +
                ", description='" + description + '\'';
    }
}

package com.hackdroid.recyclerview;

public class ListModel {
    String id, title, model;

    public ListModel(String id, String title, String model) {
        this.id = id;
        this.title = title;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

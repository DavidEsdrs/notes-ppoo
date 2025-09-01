package com.notes.model;

import java.util.ArrayList;
import java.util.List;

import com.notes.model.observers.EditorObserver;
import com.notes.model.observers.EditorPublisher;

public class Note implements EditorPublisher {
    private String content;
    private Theme theme;
    private final List<EditorObserver> observers = new ArrayList<>();

    public Note(Theme theme) {
        this.content = "";
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
        notifyObservers();
    }

    public void addObserver(EditorObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(EditorObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (EditorObserver obs : observers) {
            obs.update(this);
        }
    }
}

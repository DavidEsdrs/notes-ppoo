package com.davidesdras.model;

public abstract class NoteFactory {
    public abstract Note createNote();

    protected Note buildNote(Theme theme) {
        return new Note(theme);
    }
}

package com.davidesdras.model;


public abstract class NoteFactory {
    public abstract Note createNote();

    // Método auxiliar (ganha pontos no relatório!)
    protected Note buildNote(Theme theme) {
        return new Note(theme);
    }
}

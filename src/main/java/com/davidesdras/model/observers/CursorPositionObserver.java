package com.davidesdras.model.observers;

import com.davidesdras.model.Note;

public class CursorPositionObserver implements EditorObserver {
    private int cursorPosition = 0;

    @Override
    public void update(Note note) {
        // No Swing vamos pegar a posição real do caret (cursor),
        // aqui é só simulação
        cursorPosition = note.getContent().length();
        System.out.println("Posição do cursor: " + cursorPosition);
    }

    public int getCursorPosition() {
        return cursorPosition;
    }
}

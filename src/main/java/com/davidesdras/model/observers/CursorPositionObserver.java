package com.davidesdras.model.observers;

import com.davidesdras.model.Note;
import com.davidesdras.view.NoteEditorPanel;
import com.davidesdras.view.StatusBar;

public class CursorPositionObserver implements EditorObserver {
    private int cursorPosition = 0;
    private StatusBar statusBar;
    private NoteEditorPanel editorPanel;

    @Override
    public void update(Note note) {
        // No Swing vamos pegar a posição real do caret (cursor),
        // aqui é só simulação
        cursorPosition = note.getContent().length();
        statusBar.setCursorPosition(cursorPosition);
    }

    public int getCursorPosition() {
        return cursorPosition;
    }

    public CursorPositionObserver(StatusBar statusBar, NoteEditorPanel editorPanel) {
        this.statusBar = statusBar;
        this.editorPanel = editorPanel;
    }
}

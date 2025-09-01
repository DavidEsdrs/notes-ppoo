package com.notes.model;

import com.notes.view.NoteEditorPanel;
import com.notes.view.StatusBar;

public interface Theme {
    String getName();
    void apply(NoteEditorPanel editorPanel, StatusBar statusBar);
}
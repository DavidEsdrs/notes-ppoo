package com.davidesdras.model;

import com.davidesdras.view.NoteEditorPanel;
import com.davidesdras.view.StatusBar;

public interface Theme {
    String getName();
    void apply(NoteEditorPanel editorPanel, StatusBar statusBar);
}
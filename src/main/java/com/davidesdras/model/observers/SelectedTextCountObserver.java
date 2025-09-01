package com.davidesdras.model.observers;

import javax.swing.JTextPane;

import com.davidesdras.model.Note;
import com.davidesdras.view.NoteEditorPanel;
import com.davidesdras.view.StatusBar;

public class SelectedTextCountObserver implements EditorObserver {
  private int selectedCount = 0;
  private StatusBar statusBar;
  private NoteEditorPanel editorPanel;

  @Override
  public void update(Note note) {
    JTextPane pane = editorPanel.getTextArea();
    if (pane == null) return;
    String selectedText = pane.getSelectedText();
    if (selectedText == null) {
      statusBar.setSelectedCount(0);
      return;
    }
    selectedCount = selectedText.length();
    statusBar.setSelectedCount(selectedCount);
  }

  public int getWordCount() {
    return selectedCount;
  }

  public SelectedTextCountObserver(StatusBar statusBar, NoteEditorPanel editorPanel) {
    this.statusBar = statusBar;
    this.editorPanel = editorPanel;
  }
}

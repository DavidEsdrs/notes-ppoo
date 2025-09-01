package com.notes.model.observers;

import com.notes.model.Note;
import com.notes.view.StatusBar;

public class CharactersCountObserver implements EditorObserver {
  private int wordCount = 0;
  private StatusBar statusBar;

  @Override
  public void update(Note note) {
    String content = note.getContent();
    statusBar.setCharacters(content.length());
  }

  public int getWordCount() {
    return wordCount;
  }

  public CharactersCountObserver(StatusBar statusBar) {
    this.statusBar = statusBar;
  }
}

package com.notes.model.factories;

import com.notes.model.Note;
import com.notes.model.NoteFactory;
import com.notes.model.themes.FinanceTheme;

public class FinanceNoteFactory extends NoteFactory {
  @Override
  public Note createNote() {
    return buildNote(new FinanceTheme());
  }
}

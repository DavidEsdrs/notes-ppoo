package com.davidesdras.model.factories;

import com.davidesdras.model.Note;
import com.davidesdras.model.NoteFactory;
import com.davidesdras.model.themes.FootballTheme;

public class FootballNoteFactory extends NoteFactory {
  @Override
  public Note createNote() {
    return buildNote(new FootballTheme());
  }
}

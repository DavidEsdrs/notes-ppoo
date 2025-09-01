package com.notes.model.observers;

import com.notes.model.Note;

public interface EditorObserver {
  void update(Note note);
}

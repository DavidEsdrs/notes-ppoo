package com.notes.controller;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.notes.model.Note;
import com.notes.model.NoteFactory;
import com.notes.model.factories.FootballNoteFactory;
import com.notes.model.observers.CharactersCountObserver;
import com.notes.model.observers.CursorPositionObserver;
import com.notes.model.observers.SelectedTextCountObserver;
import com.notes.model.observers.WordCountObserver;
import com.notes.view.NoteEditorPanel;
import com.notes.view.StatusBar;

public class NoteController {
  private Note note;

  public NoteController(NoteEditorPanel editorPanel, StatusBar statusBar) {

    // Cria nota inicial com tema "Futebol"
    NoteFactory factory = new FootballNoteFactory();
    this.note = factory.createNote();

    // Adiciona observadores
    note.addObserver(new CharactersCountObserver(statusBar));
    note.addObserver(new WordCountObserver(statusBar));
    note.addObserver(new CursorPositionObserver(statusBar, editorPanel));
    note.addObserver(new SelectedTextCountObserver(statusBar, editorPanel));

    JTextPane textPane = editorPanel.getTextArea();
    textPane.getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        note.setContent(textPane.getText());
      }

      @Override
      public void removeUpdate(DocumentEvent e) {
        note.setContent(textPane.getText());
      }

      @Override
      public void changedUpdate(DocumentEvent e) {
        note.setContent(textPane.getText());
      }
    });

    textPane.addCaretListener(new CaretListener() {
      @Override
      public void caretUpdate(CaretEvent e) {
        note.setContent(textPane.getText());
      }
    });
  }
}
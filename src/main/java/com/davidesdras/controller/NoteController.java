package com.davidesdras.controller;

import com.davidesdras.model.Note;
import com.davidesdras.model.factories.FootballNoteFactory;
import com.davidesdras.model.NoteFactory;
import com.davidesdras.model.observers.CharactersCountObserver;
import com.davidesdras.model.observers.CursorPositionObserver;
import com.davidesdras.model.observers.SelectedTextCountObserver;
import com.davidesdras.model.observers.WordCountObserver;
import com.davidesdras.view.NoteEditorPanel;
import com.davidesdras.view.StatusBar;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

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

    // Conecta JTextArea → Note
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
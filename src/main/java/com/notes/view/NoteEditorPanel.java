package com.notes.view;

import javax.swing.*;

import com.notes.model.Theme;
import com.notes.model.observers.ThemeObserver;

import java.awt.BorderLayout;

public class NoteEditorPanel extends JPanel implements ThemeObserver {
  private JTextPane textArea;

  public NoteEditorPanel() {
    setLayout(new BorderLayout());
    textArea = new JTextPane();
    add(new JScrollPane(textArea), BorderLayout.CENTER);
  }

  public JTextPane getTextArea() {
    return textArea;
  }

  @Override
  public void onThemeChanged(Theme theme) {
    repaint();
  }
}
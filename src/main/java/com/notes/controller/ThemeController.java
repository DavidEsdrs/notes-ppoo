package com.notes.controller;

import com.notes.model.Theme;
import com.notes.model.factories.ThemeFactory;
import com.notes.view.NoteEditorPanel;
import com.notes.view.StatusBar;
import com.notes.view.ThemeMenu;

public class ThemeController {
  private NoteEditorPanel editorPanel;
  private StatusBar statusBar;

  public ThemeController(ThemeMenu themeMenu, NoteEditorPanel editorPanel, StatusBar statusBar) {
    this.editorPanel = editorPanel;
    this.statusBar = statusBar;

    themeMenu.addFinanceListener(e -> changeTheme("finance"));
    themeMenu.addFootballListener(e -> changeTheme("football"));
  }

  private void changeTheme(String themeName) {
    Theme theme = ThemeFactory.createTheme(themeName);
    theme.apply(editorPanel, statusBar);
  }
}

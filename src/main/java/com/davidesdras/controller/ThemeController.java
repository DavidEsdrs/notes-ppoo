package com.davidesdras.controller;

import com.davidesdras.model.Theme;
import com.davidesdras.model.factories.ThemeFactory;
import com.davidesdras.view.NoteEditorPanel;
import com.davidesdras.view.StatusBar;
import com.davidesdras.view.ThemeMenu;

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

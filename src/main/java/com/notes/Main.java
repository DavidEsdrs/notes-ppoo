package com.notes;

import javax.swing.SwingUtilities;

import com.notes.controller.NoteController;
import com.notes.controller.ThemeController;
import com.notes.view.MainWindow;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();

            new NoteController(window.getEditorPanel(), window.getStatusBar());
            new ThemeController(window.getThemeMenu(), window.getEditorPanel(), window.getStatusBar());

            window.setVisible(true);
        });
    }

    public static void noop() {
    }
}
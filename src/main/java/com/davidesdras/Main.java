package com.davidesdras;

import javax.swing.SwingUtilities;

import com.davidesdras.controller.NoteController;
import com.davidesdras.controller.ThemeController;
import com.davidesdras.view.MainWindow;

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
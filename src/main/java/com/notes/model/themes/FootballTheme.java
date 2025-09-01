package com.notes.model.themes;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import com.notes.model.Theme;
import com.notes.view.NoteEditorPanel;
import com.notes.view.StatusBar;

public class FootballTheme implements Theme {
    @Override
    public String getName() {
        return "Futebol";
    }

    @Override
    public void apply(NoteEditorPanel editorPanel, StatusBar statusBar) {
        editorPanel.setBackground(Color.GREEN.darker());

        JTextPane textArea = editorPanel.getTextArea();
        textArea.setBackground(Color.GREEN.darker());
        textArea.setForeground(Color.WHITE);
        textArea.setCaretColor(Color.YELLOW);

        statusBar.setBackground(Color.DARK_GRAY);
        statusBar.setForeground(Color.YELLOW);

        SwingUtilities.updateComponentTreeUI(editorPanel);
        SwingUtilities.updateComponentTreeUI(statusBar);
    }
}
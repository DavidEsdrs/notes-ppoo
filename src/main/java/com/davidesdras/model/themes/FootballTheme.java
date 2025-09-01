package com.davidesdras.model.themes;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import com.davidesdras.model.Theme;
import com.davidesdras.view.NoteEditorPanel;
import com.davidesdras.view.StatusBar;

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
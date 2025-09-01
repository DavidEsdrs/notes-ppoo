package com.notes.model.themes;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import com.notes.model.Theme;
import com.notes.view.NoteEditorPanel;
import com.notes.view.StatusBar;

public class FinanceTheme implements Theme {
    @Override
    public String getName() {
        return "Financeiro";
    }

    @Override
    public void apply(NoteEditorPanel editorPanel, StatusBar statusBar) {
        editorPanel.setBackground(Color.WHITE);

        JTextPane textArea = editorPanel.getTextArea();
        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.BLACK);
        textArea.setCaretColor(Color.BLUE);

        statusBar.setBackground(Color.LIGHT_GRAY);
        statusBar.setForeground(Color.BLUE);

        SwingUtilities.updateComponentTreeUI(editorPanel);
        SwingUtilities.updateComponentTreeUI(statusBar);
    }
}
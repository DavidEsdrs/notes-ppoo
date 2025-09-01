package com.notes.view;

import javax.swing.*;
import java.awt.BorderLayout;

public class MainWindow extends JFrame {
    private NoteEditorPanel editorPanel;
    private StatusBar statusBar;
    private ThemeMenu themeMenu;

    public MainWindow() {
        super("Bloco de Notas com Temas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        editorPanel = new NoteEditorPanel();
        statusBar = new StatusBar();
        themeMenu = new ThemeMenu();

        setLayout(new BorderLayout());
        add(editorPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(themeMenu);
        setJMenuBar(menuBar);
    }

    public NoteEditorPanel getEditorPanel() {
        return editorPanel;
    }

    public StatusBar getStatusBar() {
        return statusBar;
    }

    public ThemeMenu getThemeMenu() {
        return themeMenu;
    }
}
package com.notes.view;

import javax.swing.*;

import com.notes.model.Theme;
import com.notes.model.observers.ThemeObserver;

import java.awt.*;

public class StatusBar extends JPanel implements ThemeObserver {
    private JLabel charsCountLabel;
    private JLabel selectedCountLabel;
    private JLabel wordCountLabel;
    private JLabel cursorLabel;

    public StatusBar() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        charsCountLabel = new JLabel("Caracteres: 0");
        selectedCountLabel = new JLabel("Selecionado: 0");
        wordCountLabel = new JLabel("Palavras: 0");
        cursorLabel = new JLabel("Cursor: 0");

        add(charsCountLabel);
        add(new JLabel(" | "));
        add(selectedCountLabel);
        add(new JLabel(" | "));
        add(wordCountLabel);
        add(new JLabel(" | "));
        add(cursorLabel);
    }

    public void setCharacters(int count) {
        charsCountLabel.setText("Caracteres: " + count);
    }

    public void setSelectedCount(int pos) {
        selectedCountLabel.setText("Selecionado: " + pos);
    }

    public void setWordCount(int count) {
        wordCountLabel.setText("Palavras: " + count);
    }

    public void setCursorPosition(int pos) {
        cursorLabel.setText("Cursor: " + pos);
    }

    @Override
    public void onThemeChanged(Theme theme) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onThemeChanged'");
    }
}
package com.davidesdras.model.observers;

import com.davidesdras.model.Note;
import com.davidesdras.view.StatusBar;

public class WordCountObserver implements EditorObserver {
    private int wordCount = 0;
    private StatusBar statusBar;

    @Override
    public void update(Note note) {
        String content = note.getContent();
        wordCount = content.isBlank() ? 0 : content.split("\\s+").length;
        statusBar.setWordCount(wordCount); // atualiza na UI
    }

    public int getWordCount() {
        return wordCount;
    }

    public WordCountObserver(StatusBar statusBar) {
        this.statusBar = statusBar;
    }
}

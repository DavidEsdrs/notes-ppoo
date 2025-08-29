package com.davidesdras.model.observers;

import com.davidesdras.model.Note;

public class WordCountObserver implements EditorObserver {
    private int wordCount = 0;

    @Override
    public void update(Note note) {
        String content = note.getContent();
        wordCount = content.isBlank() ? 0 : content.split("\\s+").length;
        System.out.println("Contagem de palavras: " + wordCount);
    }

    public int getWordCount() {
        return wordCount;
    }
}

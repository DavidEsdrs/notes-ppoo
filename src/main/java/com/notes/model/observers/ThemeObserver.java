package com.notes.model.observers;

import com.notes.model.Theme;

public interface ThemeObserver {
    void onThemeChanged(Theme theme);
}
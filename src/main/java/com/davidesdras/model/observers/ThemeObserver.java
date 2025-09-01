package com.davidesdras.model.observers;

import com.davidesdras.model.Theme;

public interface ThemeObserver {
    void onThemeChanged(Theme theme);
}
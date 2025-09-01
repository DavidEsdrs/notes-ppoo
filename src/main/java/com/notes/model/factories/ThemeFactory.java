package com.notes.model.factories;

import com.notes.model.Theme;
import com.notes.model.themes.FinanceTheme;
import com.notes.model.themes.FootballTheme;

public class ThemeFactory {
  public static Theme createTheme(String type) {
    switch (type.toLowerCase()) {
      case "finance":
        return new FinanceTheme();
      case "football":
        return new FootballTheme();
      default:
        throw new IllegalArgumentException("Unknown theme: " + type);
    }
  }
}

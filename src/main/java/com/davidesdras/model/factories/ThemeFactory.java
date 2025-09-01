package com.davidesdras.model.factories;

import com.davidesdras.model.Theme;
import com.davidesdras.model.themes.FinanceTheme;
import com.davidesdras.model.themes.FootballTheme;

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

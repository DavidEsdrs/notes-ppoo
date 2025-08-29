package com.davidesdras.model.themes;

import com.davidesdras.model.Theme;

public class FootballTheme implements Theme {
  @Override
  public String formatTitle(String text) {
    return "⚽ " + text.toUpperCase();
  }

  @Override
  public String formatSubtitle(String text) {
    return "⚽ " + text;
  }

  @Override
  public String formatBody(String text) {
    return text;
  }
}

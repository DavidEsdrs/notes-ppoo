package com.davidesdras.view;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ThemeMenu extends JMenu {
  private JMenuItem financeItem;
  private JMenuItem footballItem;

  public ThemeMenu() {
    super("Tema");

    financeItem = new JMenuItem("Financeiro");
    footballItem = new JMenuItem("Futebol");

    add(financeItem);
    add(footballItem);
  }

  public void addFinanceListener(ActionListener listener) {
    financeItem.addActionListener(listener);
  }

  public void addFootballListener(ActionListener listener) {
    footballItem.addActionListener(listener);
  }
}
package com.davidesdras;

import com.davidesdras.model.Note;
import com.davidesdras.model.NoteFactory;
import com.davidesdras.model.factories.FinanceNoteFactory;
import com.davidesdras.model.factories.FootballNoteFactory;
import com.davidesdras.model.observers.CursorPositionObserver;
import com.davidesdras.model.observers.WordCountObserver;

public class Main {
    public static void main(String[] args) {
        NoteFactory footballFactory = new FootballNoteFactory();
        NoteFactory financeFactory = new FinanceNoteFactory();

        Note footballNote = footballFactory.createNote();
        Note financeNote = financeFactory.createNote();

        // adiciona observadores
        footballNote.addObserver(new WordCountObserver());
        footballNote.addObserver(new CursorPositionObserver());

        // simula edição de texto
        footballNote.setContent("Hoje vamos jogar no estádio.");
        footballNote.setContent("Hoje vamos jogar no estádio. Gol!");

        // outra nota
        financeNote.setContent("Controle de gastos de março.");
    }
}
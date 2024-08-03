package com.techlabs.test;

import com.techlabs.model.TicTacToeFacade;

public class TicTacToeFacadeApp {
    public static void main(String[] args) {
        TicTacToeFacade game = new TicTacToeFacade();
        game.printBoard();
        game.startGame();
    }
}

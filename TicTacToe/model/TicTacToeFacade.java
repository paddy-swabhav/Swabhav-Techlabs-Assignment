package com.techlabs.model;

import java.util.Scanner;

public class TicTacToeFacade {
    private String[][] board;
    private Scanner scanner;

    public TicTacToeFacade() {
        board = new String[3][3];
        scanner = new Scanner(System.in);
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    public void startGame() {
        while (true) {
            makeMove("X");
            printBoard();
            if (checkWin("X")) {
                System.out.println("\nPlayer 'X' wins!");
                break;
            }
            if (isBoardFull()) {
                System.out.println("\n **********************IT'S A TIE*******************");
                break;
            }

            makeMove("0");
            printBoard();
            if (checkWin("0")) {
                System.out.println("\nPlayer '0' wins!");
                break;
            }
        }
    }

    private void makeMove(String player) {
        int row, column;
        while (true) {
            System.out.println("\n\nPlayer '" + player + "', enter your move (row[1-3] column[1-3]): ");
            row = scanner.nextInt();
            column = scanner.nextInt();
            if (board[row - 1][column - 1].equals(" ")) {
                board[row - 1][column - 1] = player;
                break;
            }
            System.out.println("This move at (" + row + "," + column + ") is not valid. Try again...");
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            if (i == 1) System.out.println("\n-----------------");

            for (int j = 0; j < 3; j++) {
                if (j == 1) System.out.print("  |");
                System.out.print("  " + board[i][j]);
                if (j == 1) System.out.print("  |");
            }
            if (i == 1) System.out.println("\n-----------------");
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    return false; // There's at least one empty space
                }
            }
        }
        return true; // No empty spaces found
    }

    private boolean checkWin(String player) {
        return checkHorizontalWin(player) || checkVerticalWin(player) || checkDiagonalWin(player);
    }

    private boolean checkHorizontalWin(String player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkVerticalWin(String player) {
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(player) && board[1][j].equals(player) && board[2][j].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalWin(String player) {
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true;
        }
        if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            return true;
        }
        return false;
    }
}

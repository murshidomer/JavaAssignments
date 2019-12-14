package com.company;

public class Sudoku {
    public int[][] sudokuPuzzle;
    public int[] rowToCheck;

    public Sudoku() {
        //Initialize srray in constructor
        sudokuPuzzle = new int[][]{
                {8, 1, 0, 0, 0, 0, 0, 3, 9},
                {0, 0, 0, 9, 0, 1, 0, 0, 0},
                {3, 0, 5, 0, 0, 0, 4, 0, 1},
                {0, 0, 9, 8, 0, 2, 7, 0, 0},
                {0, 0, 0, 5, 0, 6, 0, 0, 0},
                {0, 0, 4, 3, 0, 7, 1, 0, 0},
                {1, 0, 8, 0, 0, 0, 9, 0, 2},
                {0, 0, 0, 6, 0, 4, 0, 0, 0},
                {2, 4, 0, 0, 0, 0, 0, 6, 5},

        };

        rowToCheck = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    //    method to display the array according to the format
    public void printSudoku(int[][] sampleArray) {
        for (int i = 0; i <= 8; i++) {
            if ((i % 3 == 0) && (i != 0)) {
                System.out.println();
                System.out.println("--------------------------------");

            }
            for (int j = 0; j <= 8; j++) {
                if ((j % 3 == 0) && (j != 0)) {
                    System.out.print("| ");
                }
                if (j == 8) {
                    System.out.print(sudokuPuzzle[i][j]);
                } else {
                    System.out.print(sudokuPuzzle[i][j] + ", ");
                }
            }
            System.out.println();
        }

    }

    //    method to count cells that have zeros
    public int countCellsToFill(int[][] sampleArray) {
        int count = 0;
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (sampleArray[i][j] == 0) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

//    method to check repetition in a row
    public void checkRow(int[] rowToCheck) {
        boolean repitition = false;
        for (int i = 1; i <= 8; i++) {
            if (rowToCheck[i] == rowToCheck[i - 1]) {
                repitition = true;
                break;
            } else repitition = false;
        }
        if (repitition == true) System.out.println("Repeating elements found");
        else System.out.println("No repeating elements found");
    }
}




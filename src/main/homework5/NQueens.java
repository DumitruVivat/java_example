package main.homework5;

public class NQueens {

    static final int N = 8;

    private static boolean isSafe(int[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i>= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean solveNQueens(int[][] board, int row) {

        if (row == N) {
            printSolution(board);
            return true;
        }

        boolean res = false;
        for(int col = 0; col < N; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 1;

                res = solveNQueens(board, row + 1) || res;


                board[row][col] = 0;
            }
        }
        return res;
    }

    private static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution");
        }
    }
}

package main.lesson5;

public class Task6 {
    public static void main(String[] args) {
        KnightTour.solve();
    }
}
class KnightTour {
    private static final int N = 8;

    private static final int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    private static boolean isSafe(int x, int y, int[][] board) {
        return x >= 0 && x < N && y >=0 && y < N && board[x][y] == -1;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean solveKnightTour(int x, int y, int movie, int[][] board) {

        if (movie == N * N){
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (isSafe(newX, newY, board)) {
                board[newX][newY] = movie;

                if (solveKnightTour(newX, newY, movie + 1, board)) {
                    return true;
                }

                board[newX][newY] = -1;
            }
        }
        return false;
    }

    public static void solve() {
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }

        board[0][0] = 0;

        if (solveKnightTour(0, 0, 1, board)) {
            printBoard(board);
        } else {
            System.out.println("No solution found");
        }
    }
}

package sodoku;

public class Board {
    private int[][] grid;

    public Board() {
        grid = new int[9][9];
        initializeBoard();
    }

    private void initializeBoard() {
        // Example static board, you can modify it as needed
        int[][] initialGrid = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        for (int i = 0; i < 9; i++) {
            System.arraycopy(initialGrid[i], 0, grid[i], 0, 9);
        }
    }

    public void printBoard() {
        // Optional: Print board to console for debugging
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(int row, int col, int number) {
        return isRowValid(row, number) && isColValid(col, number) && isBoxValid(row, col, number);
    }

    private boolean isRowValid(int row, int number) {
        for (int col = 0; col < 9; col++) {
            if (grid[row][col] == number) {
                return false;
            }
        }
        return true;
    }

    private boolean isColValid(int col, int number) {
        for (int row = 0; row < 9; row++) {
            if (grid[row][col] == number) {
                return false;
            }
        }
        return true;
    }

    private boolean isBoxValid(int row, int col, int number) {
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (grid[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeMove(int row, int col, int number) {
        if (isValidMove(row, col, number)) {
            grid[row][col] = number;
        }
    }
}

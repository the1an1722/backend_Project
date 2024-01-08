package leetcode;

public class GameOfLife_289 {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        // Define the eight possible directions for neighboring cells.
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};

        // Iterate through each cell in the board.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                // Check the status of all neighboring cells.
                for (int[] dir : directions) {
                    int x = i + dir[0];
                    int y = j + dir[1];

                    // Check if the neighboring cell is within the board boundaries and is live or marked as dying (-1).
                    if (x >= 0 && x < m && y >= 0 && y < n && (board[x][y] == 1 || board[x][y] == -1)) {
                        liveNeighbors++;
                    }
                }

                // Apply the Game of Life rules to update the cell status.
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = -1; // Mark the cell as dying.
                } else if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 2; // Mark the cell as newborn.
                }
            }
        }

        // Update the board based on the marked cells.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0; // Change dying cells to dead.
                } else if (board[i][j] == 2) {
                    board[i][j] = 1; // Change newborn cells to live.
                }
            }
        }
    }
}

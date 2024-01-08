package leetcode;

import java.util.*;
public class ValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {
        // Create sets to store the digits in rows, columns, and 3x3 sub-boxes
        Set<String> rows = new HashSet<>();
        Set<String> columns = new HashSet<>();
        Set<String> boxes = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char cell = board[i][j];
                if (cell == '.') {
                    continue; // Skip empty cells
                }

                String rowKey = cell + " in row " + i;
                String colKey = cell + " in col " + j;
                String boxKey = cell + " in box " + i / 3 + "-" + j / 3;

                // Check if the same digit appears in the same row, column, or box
                if (!rows.add(rowKey) || !columns.add(colKey) || !boxes.add(boxKey)) {
                    return false; // Duplicate digit found, the board is not valid
                }
            }
        }
        return true; // No duplicate digits found, the board is valid
    }
}

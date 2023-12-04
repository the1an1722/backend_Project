package leetcode;

public class ZigzagConversion_6 {
    public String convert(String s, int numRows) {
        // If numRows is 1 or the length of s is less than or equal to numRows,
        // no zigzag pattern is formed, so return the original string.
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create an array of strings, where each element represents a row in the zigzag pattern.
        String[] rows = new String[numRows];
        // Initialize each element with an empty string.
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        // Initialize variables to keep track of the current row and the direction of movement.
        int currentRow = 0; // Start from the first row.
        boolean goingDown = false; // Initially, we are not going down.

        // Iterate through the characters in the input string s.
        for (char c : s.toCharArray()) {
            // Append the current character to the string in the currentRow.
            rows[currentRow] += c;

            // Update the value of goingDown based on the current row.
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown; // Toggle goingDown at the top or bottom row.
            }

            // Update the value of currentRow based on the direction.
            currentRow += goingDown ? 1 : -1;
        }

        // Concatenate all the strings in the rows array to obtain the final result.
        StringBuilder result = new StringBuilder();
        for (String row : rows) {
            result.append(row);
        }

        // Return the final result as a single string.
        return result.toString();
    }
}

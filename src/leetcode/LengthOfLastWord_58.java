package leetcode;

public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        int length = 0;

        // Remove trailing spaces from the end of the string
        s = s.trim();

        // Iterate through the characters of the trimmed string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break; // Word ends here
            }
            length++; // Count the number of characters in the last word
        }

        return length; // Return the length of the last word
    }
}

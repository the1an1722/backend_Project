package leetcode;

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }

        // Compare the cleaned string with its reverse
        return cleaned.toString().contentEquals(cleaned.reverse());
    }
}

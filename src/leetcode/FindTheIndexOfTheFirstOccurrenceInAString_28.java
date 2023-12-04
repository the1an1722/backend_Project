package leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString_28 {
    public int strStr(String haystack, String needle) {
        // Handle edge cases
        if (needle.isEmpty()) {
            return 0; // Empty needle is always found at index 0.
        }

        if (haystack.length() < needle.length()) {
            return -1; // Needle is longer than haystack, so it can't be found.
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i; // Found a match, return the starting index.
            }
        }

        return -1; // Needle was not found in haystack.
    }
}

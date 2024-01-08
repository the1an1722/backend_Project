package leetcode;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
        // Check if the input string is null or empty
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0; // Initialize the maximum length of the substring
        int left = 0; // Initialize the left pointer of the sliding window
        HashMap<Character, Integer> charIndexMap = new HashMap<>(); // Store character indices

        // Iterate through the string with a sliding window
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right); // Get the character at the right pointer

            // If the character is already in the map, update the left pointer to the next position
            if (charIndexMap.containsKey(c)) {
                left = Math.max(left, charIndexMap.get(c) + 1);
            }

            charIndexMap.put(c, right); // Update the character's index in the map
            maxLength = Math.max(maxLength, right - left + 1); // Update the maximum length
        }

        return maxLength; // Return the maximum length of the substring without repeating characters
    }
}

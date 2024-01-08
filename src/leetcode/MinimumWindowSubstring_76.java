package leetcode;

import java.util.*;
public class MinimumWindowSubstring_76 {
    public String minWindow(String s, String t) {
        // Create a map to store the frequency of characters in string t
        Map<Character, Integer> targetCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
        }

        int left = 0; // Left pointer of the window
        int minLen = Integer.MAX_VALUE; // Minimum window length
        int minLeft = 0; // Left index of the minimum window
        int count = 0; // Count of characters in string t found in the current window

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // If the current character exists in string t, decrement its count in the map
            if (targetCount.containsKey(rightChar)) {
                targetCount.put(rightChar, targetCount.get(rightChar) - 1);
                if (targetCount.get(rightChar) >= 0) {
                    count++;
                }
            }

            // If all characters in string t are found in the current window
            while (count == t.length()) {
                // Update the minimum window length and left index if a smaller window is found
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);

                // If the left character exists in string t, increment its count in the map
                if (targetCount.containsKey(leftChar)) {
                    targetCount.put(leftChar, targetCount.get(leftChar) + 1);
                    if (targetCount.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++; // Move the left pointer to the right
            }
        }

        // If no valid window is found, return an empty string
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minLeft, minLeft + minLen);
    }
}

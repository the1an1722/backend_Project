package leetcode;

import java.util.*;
public class SubstringWithConcatenationOfAllWords_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length(); // Length of each word in words array
        int totalWords = words.length; // Total number of words in the words array
        int windowSize = wordLength * totalWords; // Size of the sliding window

        // Create a map to store the frequency of each word in the words array
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            int count = 0;

            Map<String, Integer> currentWindow = new HashMap<>();

            // Move the sliding window to the right
            while (right + wordLength <= s.length()) {
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordCount.containsKey(word)) {
                    currentWindow.put(word, currentWindow.getOrDefault(word, 0) + 1);
                    count++;

                    // Remove words from the left of the window until it's valid
                    while (currentWindow.getOrDefault(word, 0) > wordCount.getOrDefault(word, 0)) {
                        String leftWord = s.substring(left, left + wordLength);
                        currentWindow.put(leftWord, currentWindow.get(leftWord) - 1);
                        count--;
                        left += wordLength;
                    }

                    // If a valid concatenated substring is found, add its starting index to the result
                    if (count == totalWords) {
                        result.add(left);
                        String leftWord = s.substring(left, left + wordLength);
                        currentWindow.put(leftWord, currentWindow.get(leftWord) - 1);
                        count--;
                        left += wordLength;
                    }
                } else {
                    // If the current word is not in words array, reset the window
                    currentWindow.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}

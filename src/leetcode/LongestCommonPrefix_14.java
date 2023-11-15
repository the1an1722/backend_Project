package leetcode;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;

        // Find the minimum length among all strings in the array
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        // Initialize the result string
        StringBuilder result = new StringBuilder();

        // Compare characters at the same position in all strings
        for (int i = 0; i < minLen; i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return result.toString();
                }
            }

            result.append(currentChar);
        }

        return result.toString();
    }
}

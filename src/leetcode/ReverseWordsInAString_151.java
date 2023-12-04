package leetcode;

public class ReverseWordsInAString_151 {

        public String reverseWords(String s) {
            if (s == null || s.isEmpty()) {
                return "";
            }

            // Split the input string into words using space as a delimiter
            String[] words = s.trim().split("\\s+");

            // Initialize a StringBuilder to build the reversed string
            StringBuilder reversed = new StringBuilder();

            // Append the words in reverse order with a single space between them
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i > 0) {
                    reversed.append(" ");
                }
            }

            return reversed.toString();
        }
}

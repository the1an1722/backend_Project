package leetcode;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0; // Pointer for string s
        int tPointer = 0; // Pointer for string t

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++; // Move the pointer for string s
            }
            tPointer++; // Always move the pointer for string t
        }

        // If we have successfully traversed string s, then it is a subsequence of t
        return sPointer == s.length();
    }
}

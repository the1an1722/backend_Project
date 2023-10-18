package leetcode;

public class HIndex_274 {
    class Solution {
        public int hIndex(int[] citations) {
            int n = citations.length;
            int[] count = new int[n + 1];

            // Count the number of papers for each citation count.
            for (int citation : citations) {
                if (citation >= n) {
                    count[n]++;
                } else {
                    count[citation]++;
                }
            }

            int total = 0;
            // Calculate cumulative paper count in reverse order.
            for (int i = n; i >= 0; i--) {
                total += count[i];
                // Find the h-index.
                if (total >= i) {
                    return i;
                }
            }
            return 0;
        }
    }
}

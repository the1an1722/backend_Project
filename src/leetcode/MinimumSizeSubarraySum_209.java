package leetcode;

public class MinimumSizeSubarraySum_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0; // Initialize two pointers.
        int sum = 0; // Initialize the current sum.
        int minLength = Integer.MAX_VALUE; // Initialize the minimum length.

        while (right < nums.length) {
            sum += nums[right]; // Add the current element to the sum.
            right++; // Move the right pointer to the right.

            // Check if the current sum is greater than or equal to the target.
            while (sum >= target) {
                minLength = Math.min(minLength, right - left); // Update the minimum length.

                // Remove the leftmost element from the sum and move the left pointer to the right.
                sum -= nums[left];
                left++;
            }
        }

        // If minLength is still the initial value, there's no such subarray.
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

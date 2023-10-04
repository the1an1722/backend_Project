package leetcode;

public class RemoveDuplicatesfromSortedArrayII_80 {
    /**
     * Removes all duplicates from a sorted array such that each element appears at
     * most twice and returns the new length of the array.
     *
     * @param nums The sorted array from which to remove duplicates.
     * @return The new length of the array after removing all duplicates.
     */
    public int removeDuplicates(int[] nums) {
        // Initialize two pointers
        int left = 0;
        int right = 1;

        // Initialize a count variable to keep track of the number of occurrences of
        // each element
        int count = 1;

        // Iterate through the array
        while (right < nums.length) {
            // If the current element is the same as the previous element, increment the
            // count
            if (nums[left] == nums[right]) {
                count++;
            } else {
                // If the current element is different from the previous element, reset the
                // count to 1
                count = 1;
            }

            // If the count is less than or equal to 2, copy the current element to the next
            // position in the array
            if (count <= 2) {
                nums[++left] = nums[right];
            }

            // Move the right pointer to the next element
            right++;
        }

        // Return the new length of the array
        return left + 1;
    }
}

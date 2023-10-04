package leetcode;

public class RemoveDuplicatesfromSortedArray_26 {
    /**
     * Removes all duplicates from a sorted array and returns the new length of the
     * array.
     *
     * @param nums The sorted array from which to remove duplicates.
     * @return The new length of the array after removing all duplicates.
     */
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;

        // Move the right pointer until it reaches the end of the array.
        while (right < nums.length) {
            // If the current element is not equal to the element at the left pointer,
            if (nums[left] != nums[right]) {
                // increment the left pointer and replace the element at the left pointer with
                nums[++left] = nums[right];
            }
            right++;
        }

        return left + 1;
    }
}

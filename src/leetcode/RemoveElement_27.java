package leetcode;

public class RemoveElement_27 {
    /**
     * Removes all occurrences of a given value from an array and returns the new
     * length of the array.
     * 
     * @param nums The array from which to remove the value.
     * @param val  The value to remove from the array.
     * @return The new length of the array after removing all occurrences of the
     *         value.
     */
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                // If the current element equals the target value, replace it with the element
                // at the right pointer.
                nums[left] = nums[right];
                right--;
            } else {
                // If the current element is not equal to the target value, move the left
                // pointer to the next element.
                left++;
            }
        }

        // The value of 'left' represents the new length of the array after removing all
        // occurrences of the value.
        return left;
    }
}

package leetcode;

public class MajorityElement_169 {
    //
    public int majorityElement(int[] nums) {
        // Initialize a variable to store the majority element
        int majorityElement = nums[0];

        // Initialize a variable to store the count of the majority element
        int count = 1;

        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current element is the same as the majority element, increment the count
            if (nums[i] == majorityElement) {
                count++;
            } else {
                // If the current element is different from the majority element, decrement the count
                count--;
            }

            // If the count is less than 1, replace the majority element with the current element
            if (count < 1) {
                majorityElement = nums[i];
                count = 1;
            }
        }

        // Return the majority element
        return majorityElement;
    }
}

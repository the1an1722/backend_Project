package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order.
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int target = -nums[i]; // Find the target value.
                int left = i + 1, right = nums.length - 1;

                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        // Found a triplet that sums to zero.
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates.
                        while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates.
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < target) {
                        left++; // Move the left pointer.
                    } else {
                        right--; // Move the right pointer.
                    }
                }
            }
        }

        return result;
    }
}

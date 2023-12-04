package leetcode;

public record TwoSumII_InputArrayIsSorted_167() {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; // Pointer for the leftmost element
        int right = numbers.length - 1; // Pointer for the rightmost element

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // 1-indexed
            } else if (sum < target) {
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }

        // No solution found
        return new int[] {-1, -1};
    }
}

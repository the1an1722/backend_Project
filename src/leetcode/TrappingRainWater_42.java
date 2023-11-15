package leetcode;

public class TrappingRainWater_42 {
    public int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0; // Cannot trap water with less than 3 bars
        }

        int left = 0; // Left pointer
        int right = n - 1; // Right pointer
        int leftMax = 0; // Maximum height on the left
        int rightMax = 0; // Maximum height on the right
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                // Update leftMax and calculate trapped water on the left
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                // Update rightMax and calculate trapped water on the right
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }
}

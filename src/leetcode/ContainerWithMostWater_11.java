package leetcode;

public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int maxArea = 0;  // Variable to store the maximum area
        int left = 0;     // Initialize the left pointer
        int right = height.length - 1;  // Initialize the right pointer

        while (left < right) {  // Continue the loop while the left pointer is less than the right pointer
            int hLeft = height[left];    // Height of the left pillar
            int hRight = height[right];  // Height of the right pillar
            int minHeight = Math.min(hLeft, hRight);  // Calculate the height of the shorter pillar
            maxArea = Math.max(maxArea, minHeight * (right - left));  // Calculate the current area and update the maximum area

            if (hLeft < hRight) {
                left++;  // If the left pillar is shorter, move the left pointer to the right
            } else {
                right--;  // If the right pillar is shorter, move the right pointer to the left
            }
        }

        return maxArea;  // Return the maximum area
    }
}

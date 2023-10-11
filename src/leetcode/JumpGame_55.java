package leetcode;

public class JumpGame_55 {
        public boolean canJump(int[] nums) {
            int maxJump = 0; // Variable to track the farthest position we can currently reach.
            int n = nums.length;

            for (int i = 0; i < n; i++) {
                if (i > maxJump) {
                    // If the current position is beyond the farthest reachable position, we can't reach  the last position.
                    return false;
                }
                maxJump = Math.max(maxJump, i + nums[i]);

                if (maxJump >= n - 1) {
                    // If the current farthest reachable position exceeds the last position, return true.
                    return true;
                }
            }
            return maxJump >= n - 1;
        }
}

//Question link- https://leetcode.com/problems/longest-consecutive-sequence/

//Time complexity- O(n log n)

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int count = 0;
        int max = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            } else if (nums[i] - nums[i - 1] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        // Perform the final check and update inside the loop
        if (count > max) {
            max = count;
        }

        return max + 1;
    }
}




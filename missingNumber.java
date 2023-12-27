//Question Link- https://leetcode.com/problems/missing-number/

//Solution-1
//Time complexity-O(nlogn)
//Space complexity-O(1)

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        // Check if the missing number is at the beginning
        if (nums[0] != 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return nums.length;  // Return the last number in the range if no missing number is found
    }
}

//Question link- https://leetcode.com/problems/single-number/

//Solution-1
//Time complexity- O(n log n)

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}


//Solution-2
//Time complexity - O(n)- better approach

class Solution {
    public int singleNumber(int[] nums) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            output = output ^ nums[i];
        }
        return output;
    }
}





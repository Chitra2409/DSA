//Question link- https://leetcode.com/problems/move-zeroes/

//Time complexity- O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIdx = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, swap it with the first zero encountered
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIdx];
                nums[nonZeroIdx] = temp;
                nonZeroIdx++;
            }
        }
    }
}

//Question link- https://leetcode.com/problems/contains-duplicate/

//Time complexity: O(nlog(n))
//Space complexity: O(log(n))

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }
}


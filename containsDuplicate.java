//Question link- https://leetcode.com/problems/contains-duplicate/

//Solution-1(By sorting arrays)
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


//Solution-2(By using hashset)
//Time complexity: O(n)
//Space complexity: O(n)

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}



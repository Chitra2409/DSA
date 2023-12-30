//Question link- https://leetcode.com/problems/find-all-duplicates-in-an-array/

//Time complexity- O(n log n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}

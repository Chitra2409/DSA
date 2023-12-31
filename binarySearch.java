//Question link- https://leetcode.com/problems/binary-search/

//Time complexity- O(log n)

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Target not found
    }
}


//int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java

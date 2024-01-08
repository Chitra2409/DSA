//Question link - https://leetcode.com/problems/find-the-duplicate-number/

//Solution 1 - After sorting the array
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
        
    }
}

//Solution 2 - Without modifying the array
class Solution {
    public int findDuplicate(int[] nums) {
        // Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];

        // Move slow by one step and fast by two steps until they meet
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Reset one pointer to the beginning
        slow = nums[0];

        // Move both pointers one step at a time until they meet again
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // Return the duplicate number
        return slow;
    }
}



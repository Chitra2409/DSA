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


/* Explaination:
1) Base Case:If the input array nums is empty (nums.length == 0), the function immediately returns 0, as there are no elements in the array.
2) Sorting:The array nums is sorted in ascending order using Arrays.sort(nums). Sorting the array is a key step in this approach.
3) Iterating Through Sorted Array:The code then iterates through the sorted array using a for loop, starting from index 1.
The loop compares the current element (nums[i]) with the previous element (nums[i-1]).
4) Counting Consecutive Elements:If the current element is the same as the previous one, it continues to the next iteration (continue statement), skipping duplicate elements.
If the difference between the current element and the previous one is 1, it means they are consecutive. In this case, the cnt variable is incremented.
5) Updating Maximum Length:If the consecutive sequence is broken (i.e., the difference is not 1), it checks whether the current consecutive count (cnt) is greater than the maximum length encountered so far (max). If yes, it updates max with the value of cnt.
6) Resetting Count:After each consecutive sequence is broken, the cnt variable is reset to 0.
7) Final Check and Return:After the loop, there is a final check to see if the last consecutive sequence is longer than the maximum encountered so far. If yes, it updates max again.
The function returns max + 1 because the length of the consecutive sequence is max + 1.
*/



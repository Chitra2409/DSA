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

/*
Explaination of solution-2
1) Initialization: We start by initializing a variable result to 0. This variable will eventually hold the single number that appears only once in the array.
2) XOR Operation in the Loop: We iterate through each element of the array (nums) using a loop. For each element, we perform the XOR operation (^) between the current value of result and the current element of the array.
The XOR operation has the property that if you XOR a number with itself, the result is 0. If you XOR a number with 0, the result is the number itself. Therefore, when there are duplicate numbers, they cancel each other out.
3) Final Result: After completing the loop, the result variable will contain the XOR of all the elements in the array. Due to the XOR properties, the duplicates have canceled each other out, leaving only the value that appears once.
*/



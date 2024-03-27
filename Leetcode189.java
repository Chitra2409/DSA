class Solution {
    public void rotate(int[] nums, int k) {

       int size = nums.length;
       k= k%size;
       reverse(nums, size-k, size-1);
       reverse(nums, 0, size-k-1);
       reverse(nums, 0, size-1);
    }
    public void reverse(int[] nums, int startInd, int endInd){
        for (int i =0; i< (endInd-startInd+1)/2; i++){
            int temp = nums[startInd+i];
            nums[startInd+i]=nums[endInd-i];
            nums[endInd-i]=temp;
        }
    }
}

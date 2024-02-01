//Question Link- https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Solution {
    public static int countday(int arr[],int capacity){
        int day=1;
        int load=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(load+arr[i]>capacity){
                day++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int ele:weights){
            low=Math.max(low,ele);
            high+=ele;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(countday(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}

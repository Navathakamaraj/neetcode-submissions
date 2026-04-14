public class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length - 1;
        int n=nums[0];

        while (s<=e) {
            if (nums[s]<nums[e]) {
                n=Math.min(n,nums[s]);
                break;
            }
            int m=(s+e)/2;
            n=Math.min(n,nums[m]);
            if (nums[m]>=nums[s]) {
                s=m+1;
            } 
            else{
                e=m-1;
                }
        }
        return n;
    }
}

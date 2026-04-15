class Solution {
    public int search(int[] nums, int target) {
        int s=0,e=nums.length-1;int m=0;

        while(s<e){
            m=(s+e)/2;
            if(nums[m]>nums[e]){
                s=m+1;
            }else{
                e=m;
            }
        }
        int pivot=s; 

       
        int k=0,k1=pivot-1;
        while(k<=k1){
            m=(k+k1)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) k1=m-1;
            else k=m+1;
        }

     
        k=pivot;
        k1=nums.length-1;
        while(k<=k1){
            m=(k+k1)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) k1=m-1;
            else k=m+1;
        }

        return -1;
    }
}
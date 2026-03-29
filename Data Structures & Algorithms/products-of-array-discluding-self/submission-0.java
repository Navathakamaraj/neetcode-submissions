class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int c=1;
        for(int i=0;i<n;i++){
            c=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                     c*=nums[j];
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}  

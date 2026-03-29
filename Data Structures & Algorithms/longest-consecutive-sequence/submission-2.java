class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
        return 0;
        int c=1;int m=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
            if(nums[i]-nums[i-1]==1){
                c++;
            }
            
            else{
                m=Math.max(m,c);
                c=1;
            }
        }
        }
        return Math.max(m, c);
    }
}

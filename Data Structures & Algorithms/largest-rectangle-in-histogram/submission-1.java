class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        int max= 0;

        for (int i = 0; i < n; i++) {
            int min = nums[i];          

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);        
                int a = min * (j - i + 1);         
                max = Math.max(max, a);
            }
        }

        return max;
    }
}
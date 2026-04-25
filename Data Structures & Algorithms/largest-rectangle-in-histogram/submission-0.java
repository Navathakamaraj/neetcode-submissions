class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int min = nums[i];          // ✅ reset min for each subarray start

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);         // ✅ track min of current subarray
                int area = min * (j - i + 1);         // ✅ multiply by subarray length
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
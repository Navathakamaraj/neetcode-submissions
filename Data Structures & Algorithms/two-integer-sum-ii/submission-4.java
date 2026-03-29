class Solution {
    public int[] twoSum(int[] n, int t) {
        int s = 0, e = n.length - 1;
        while (s < e) {
            int c = n[s] + n[e];
            if (c == t) {
                return new int[]{s + 1, e + 1}; 
            } else if (c > t) {
                e--;
            } else {
                s++;
            }
        }
        return new int[]{-1, -1}; 
    }
}

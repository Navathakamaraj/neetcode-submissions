class Solution {
    public int minEatingSpeed(int[] n, int k) {
int m = 0, sum = 0;
        for (int i = 0; i < n.length; i++) {
            m = Math.max(m, n[i]); 
                       
        }

        int s = 1, e = m, ans = 0;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (ispossible(n, mid, k)) {
                ans = mid;
                e = mid - 1;  
            } else {
                s = mid + 1;  
            }
        }
        return ans;
    }
     boolean ispossible(int arr[], int x, int k) {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) {
           sum+=Math.ceil((double)arr[i] / x);
                if(sum>k){
                    return false;
                }
            }
        
        return true;
    }
}
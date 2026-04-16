class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans=new int[t.length];
        for(int i=0;i<t.length;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i]<t[j]){
                ans[i]=j-i;
                break;
                }
            }
        }
        return ans;
    }
} 
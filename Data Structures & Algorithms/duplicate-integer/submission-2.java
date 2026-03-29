class Solution {
    public boolean hasDuplicate(int[] arr) {
        int n=arr.length;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
         }
         return false;
    }
}
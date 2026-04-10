class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
           int m = Integer.MIN_VALUE;

            for(int j=i;j<i+k;j++){
                if(m<nums[j]){
                    m=nums[j];
                }}
                arr.add(m);
         }
         int[] arr1 = arr.stream().mapToInt(Integer::intValue).toArray();
         return arr1;
    }
}

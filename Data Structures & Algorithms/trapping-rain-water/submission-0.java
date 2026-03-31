class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] l=new int[n];
        l[0]=h[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],h[i]);
        }

        int[] e=new int[n];
        e[n-1]=h[n-1];

        for(int i=n-2;i>=0;i--){
            e[i]=Math.max(e[i+1],h[i]);
        }
   int w=0,c=0;
        for(int i=1;i<n-1;i++){
            w=Math.min(l[i],e[i])-h[i];
            c+=w;
        }
        return c;
    }
}
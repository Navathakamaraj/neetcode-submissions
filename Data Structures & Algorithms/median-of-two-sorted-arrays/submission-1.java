class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {

        int t = n1.length + n2.length;
        int k;

        if (t % 2 == 0)
            k = t / 2;
        else
            k = (t / 2) + 1;

        int s = 0, e = n1.length, m = 0;
        int al = 0, ar = 0, bl = 0, br = 0;
        double median=0;

        while (s <= e) {

            m = (s + e) / 2;
            int t1 = k - m;

  
            if (m <= n1.length && t1 <= n2.length && t1 >= 0) {

            
                if (m == 0)
                    al = Integer.MIN_VALUE;
                else
                    al = n1[m - 1];

                if (m == n1.length)
                    ar = Integer.MAX_VALUE;
                else
                    ar = n1[m];

                if (t1 == 0)
                    bl = Integer.MIN_VALUE;
                else
                    bl = n2[t1 - 1];

                if (t1 == n2.length)
                    br = Integer.MAX_VALUE;
                else
                    br = n2[t1];

                if (al <= br && bl <= ar) {

                    if (t % 2 == 0) {
                      median=  (Math.max(al, bl) + Math.min(ar, br)) / 2.0;
                      break;
                    } 
                    else {
                        median= Math.max(al, bl);
                        break;
                    }
                }
                else if (al > br) {
                    e = m - 1;
                }
                else {
                    s = m + 1;
                }
            }
            
            else if (t1 < 0) {
                e = m - 1;
            }
            else {
                s = m + 1;
            }
        }

        return median ;
    }
}
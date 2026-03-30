class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length()-1;
        String st="";
        int m=0;
         while (n >= 0) {
            char c = s.charAt(n);

            if (st.indexOf(c) == -1) {
                st += c;
                m = Math.max(m, st.length());
            } else {
             
                int dupIndex = st.indexOf(c);
                st = st.substring(dupIndex + 1) + c;
            }
            n--;
        }

        return m;
    }
}

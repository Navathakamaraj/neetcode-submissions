class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = Integer.MAX_VALUE;
        String r = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + t.length(); j <= n; j++) {

                int[] count = new int[128];
                for (char c : t.toCharArray()) count[c]++;
                for (char c : s.substring(i, j).toCharArray()) count[c]--;

                boolean k = true;
                for (char c : t.toCharArray()) {
                    if (count[c] > 0) { 
                        k = false;
                         break; 
                         }
                }

                if (k && j - i < m) {
                    m = j - i;
                    r= s.substring(i, j);
                }
            }
        }
        return r;
    }
}
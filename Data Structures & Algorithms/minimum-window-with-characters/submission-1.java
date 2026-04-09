class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + t.length(); j <= n; j++) {

                int[] count = new int[128];
                for (char c : t.toCharArray()) count[c]++;
                for (char c : s.substring(i, j).toCharArray()) count[c]--;

                boolean ok = true;
                for (char c : t.toCharArray()) {
                    if (count[c] > 0) { ok = false; break; }
                }

                if (ok && j - i < minLen) {
                    minLen = j - i;
                    result = s.substring(i, j);
                }
            }
        }
        return result;
    }
}
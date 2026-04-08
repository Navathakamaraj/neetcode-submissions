class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length() - s1.length();
        int c = 0;

        char[] sorted1 = s1.toCharArray();
        Arrays.sort(sorted1);

        for (int i = 0; i <= n; i++) {
            String st = "" + s2.charAt(i);
            int j = i + 1;
            int n1 = 1;

            while (n1 < s1.length() && j < s2.length()) {
                st = st + s2.charAt(j);
                j++;
                n1++;
            }

            char[] sortedSt = st.toCharArray();
            Arrays.sort(sortedSt);

            if (Arrays.equals(sorted1, sortedSt))
                return true;
        }

        return false;
    }
}
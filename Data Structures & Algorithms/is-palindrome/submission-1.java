class Solution {
    public boolean isPalindrome(String s) {
      String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         char[] ch=st.toCharArray();
        int p=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[p]!=ch[i])
            return false;
            p++;
        }
        return true;
    }
}

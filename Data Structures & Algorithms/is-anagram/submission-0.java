class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
      char[] ch=s.toCharArray();
      char[] hc=t.toCharArray();
      Arrays.sort(ch);
      Arrays.sort(hc);

      for(int i=0;i<ch.length;i++){
        if(ch[i]!=hc[i]){
           return false;
        }
      }

      return true;
    }
}

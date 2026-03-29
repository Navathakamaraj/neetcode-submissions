class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> a = new ArrayList<>();
        String[] st=new String[strs.length];
     boolean[] vi= new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            st[i]=new String(ch);
            
        }
       for (int i = 0; i < st.length; i++) {
        if (vi[i]) continue;
          List<String> gr = new ArrayList<>();
            gr.add(strs[i]);
            vi[i] = true;

        

            for (int j = i + 1; j < st.length; j++) {
                if (!vi[j] && st[i].equals(st[j])) {
                    gr.add(strs[j]);
                    vi[j]=true;
                     }
            }
            a.add(gr);
        }

        return a;
    }
}

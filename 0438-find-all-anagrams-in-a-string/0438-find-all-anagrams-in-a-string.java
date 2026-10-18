class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int[] patt=new int[26];
        int[] windA=new int[26];
        int pn=p.length();
        int sn=s.length();
        if(pn>sn){
            return ans;
        }
        for(int i=0;i<pn;i++){
            patt[p.charAt(i)-'a']++;
            windA[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(patt,windA)){
            ans.add(0);
        }
        for(int i=pn;i<sn;i++){
            windA[s.charAt(i-pn)-'a']--;
            windA[s.charAt(i)-'a']++;
            if(Arrays.equals(patt,windA)){
                ans.add(i-pn+1);
            }

        }
        return ans;
        
    }
}
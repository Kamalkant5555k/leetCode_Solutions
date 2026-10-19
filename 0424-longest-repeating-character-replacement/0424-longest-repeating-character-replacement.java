class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int left=0;
        int maxF=0;
        int maxR=0;
        for(int ryt=0;ryt<n;ryt++){
            char c=s.charAt(ryt);
            map.put(c,map.getOrDefault(c,0)+1);
            maxF=Math.max(maxF,map.get(c));
            while((ryt-left+1)-maxF>k){
                char prev=s.charAt(left);
                map.put(prev,map.get(prev)-1);
                if(map.get(prev)==0){
                    map.remove(prev);
                }
                left++;
            }
            maxR=Math.max(maxR,ryt-left+1);
        }
        return maxR;
        
    }
}
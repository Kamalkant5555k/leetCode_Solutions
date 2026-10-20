class Solution {
    public int maxConsecutiveAnswers(String str, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxLen=0;
        int left=0;
        int maxF=0;
        int n=str.length();
        for(int ryt=0;ryt<n;ryt++){
            char c=str.charAt(ryt);
            map.put(c,map.getOrDefault(c,0)+1);
            maxF=Math.max(maxF,map.get(c));
            while((ryt-left+1)-maxF>k){
                char prev=str.charAt(left);
                map.put(prev,map.get(prev)-1);
                if(map.get(prev)==0){
                    map.remove(prev);
                }
                left++;
            }
            maxLen=Math.max(maxLen,ryt-left+1);
        }
        return maxLen;
        
    }
}
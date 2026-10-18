class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int minLen=Integer.MAX_VALUE;
        int n=cards.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(cards[i])){
                minLen=Math.min(minLen,i-map.get(cards[i])+1);
                map.put(cards[i],i);
            }else{
                map.put(cards[i],i);
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return -1;
        }
        return minLen;
        
    }
}
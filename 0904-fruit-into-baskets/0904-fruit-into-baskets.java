class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=fruits.length;
        int left=0;
        int maxT=Integer.MIN_VALUE;
        for(int ryt=0;ryt<n;ryt++){
            map.put(fruits[ryt],map.getOrDefault(fruits[ryt],0)+1);
            if(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxT=Math.max(maxT,ryt-left+1);
        }
        return maxT;
        
    }
}
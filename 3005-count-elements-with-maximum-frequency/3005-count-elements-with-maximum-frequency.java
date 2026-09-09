class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        int maxF=0;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            maxF=Math.max(maxF,hm.get(nums[i]));
        }
        int count=0;
      
        for(int key:hm.keySet()){
            if(maxF==hm.get(key)){
                count+=maxF;
            }
           
        }
        return count;
        
    }
}
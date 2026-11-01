class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int n=nums.length;
       // we focus on min element--
       int min=Integer.MAX_VALUE;
       for(int num:nums){
        min=Math.min(min,num);
       }
        for(int num:nums){
            sum+=(num-min);
        }
        return sum;
        
    }
}
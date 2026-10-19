class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int left=0;
        int nZ=0;
        int maxLen=Integer.MIN_VALUE;
        for(int ryt=0;ryt<n;ryt++){
            if(nums[ryt]==0){
                nZ++;
            }
            while(nZ>1){
                if(nums[left]==0){
                    nZ--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,ryt-left);
        }
        return maxLen;

        
    }
}
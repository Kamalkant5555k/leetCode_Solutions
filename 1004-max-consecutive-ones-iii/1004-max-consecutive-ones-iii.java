class Solution {
    public int longestOnes(int[] nums, int k) {
        int zC=0;
        int maxOnes=0;
        int n=nums.length;
        int left=0;
        for(int ryt=0;ryt<n;ryt++){
            if(nums[ryt]==0){
                zC++;
            }
            while(zC>k){
                if(nums[left]==0){
                    zC--;
                }
                left++;
            }
            maxOnes=Math.max(maxOnes,ryt-left+1);
        }
        return maxOnes;
        
    }
}
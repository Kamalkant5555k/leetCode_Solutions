class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int count=0;
        int n=nums.length;
        int pro=1;
        if(k<=1){
            return 0;
        }
        for(int ryt=0;ryt<n;ryt++){
            pro=pro*nums[ryt];
            while(pro>=k){
                pro=pro/nums[left];
                left++;

            }
            count+=ryt-left+1;
        }
        return count;
        
    }
}
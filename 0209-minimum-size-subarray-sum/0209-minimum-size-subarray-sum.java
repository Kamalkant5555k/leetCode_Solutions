class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSub=Integer.MAX_VALUE;
        int n=nums.length;
        int sum=0;
        int left=0;
        for(int ryt=0;ryt<n;ryt++){
            sum+=nums[ryt];
          while (sum >= target) {
                minSub = Math.min(minSub, ryt - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(minSub==Integer.MAX_VALUE){
            return 0;
        }
        return minSub;
        
    }
}
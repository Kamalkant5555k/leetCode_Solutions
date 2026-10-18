class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long maxS=0;
        int left=0;
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int ryt=0;ryt<n;ryt++){
            if(!set.contains(nums[ryt])){
                sum+=nums[ryt];
                set.add(nums[ryt]);
                while(k<ryt-left+1){
                    sum-=nums[left];
                    set.remove(nums[left]);
                    left++;
                }
                }else{
                    while(set.contains(nums[ryt])){
                        sum-=nums[left];
                        set.remove(nums[left]);
                        left++;
                    }
                    set.add(nums[ryt]);
                    sum+=nums[ryt];
                }
            
            if(ryt-left+1==k){
                maxS=Math.max(maxS,sum);
            }

        }
        return maxS;
        
    }
}
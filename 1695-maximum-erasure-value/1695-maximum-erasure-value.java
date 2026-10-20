class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int maxS=Integer.MIN_VALUE;
        int sum=0;
        int left=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[i]);
            maxS=Math.max(maxS,sum);
        }
        return maxS;

        
    }
}
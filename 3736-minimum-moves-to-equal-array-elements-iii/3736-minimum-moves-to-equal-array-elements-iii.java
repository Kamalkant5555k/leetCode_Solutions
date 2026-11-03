class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int n=nums.length;
        Arrays.sort(nums);
        int last=nums[n-1];
        for(int num:nums){
            sum+=Math.abs(num-last);
        }
        return sum;
        
    }
}
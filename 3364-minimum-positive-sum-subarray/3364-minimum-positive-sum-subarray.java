class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int minSum=Integer.MAX_VALUE;
        for(int k=l;k<=r;k++){
            if(k>n){
                break;
            }
            int sum=0;
            for(int i=0;i<k;i++){
                sum+=nums.get(i);
            }
            if(sum>0){
                minSum=Math.min(minSum,sum);
            }
            for(int i=k;i<n;i++){
                sum=sum-nums.get(i-k)+nums.get(i);
                if(sum>0){
                    minSum=Math.min(minSum,sum);
                }
            }
        }
        if(minSum==Integer.MAX_VALUE){
            return -1;
        }
        return minSum;
        
    }
}
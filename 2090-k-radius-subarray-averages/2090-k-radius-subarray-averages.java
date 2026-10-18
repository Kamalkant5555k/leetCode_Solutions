class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] avg=new int[n];
        Arrays.fill(avg,-1);
        if(n<2*k+1){
            return avg;
        }
        long sum=0;
        for(int i=0;i<2*k;i++){
            sum=(long)nums[i]+sum;
        }
        int idx=k;
        long tn=2*k+1;
        int left=0;
        for(int i=2*k;i<n;i++){
            sum+=nums[i];
            avg[idx++]=(int)(sum/tn);
            sum-=nums[left];
            left++;
        }
        return avg;
        
    }
}
class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
       //-- its give TLE--
    //    int minDiff=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //         sum=sum+Math.abs(nums[j]-nums[i]);
        //         }
        //     }
        //     minDiff=Math.min(sum,minDiff);
        // }  
        Arrays.sort(nums);
        int median=nums[n/2];
        int sum=0;
        for(int num:nums){
            sum+=Math.abs(num-median);

        }
     
        return sum;      
    }
}
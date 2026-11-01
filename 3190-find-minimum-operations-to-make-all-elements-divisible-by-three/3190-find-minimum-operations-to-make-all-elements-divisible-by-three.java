class Solution {
    public int minimumOperations(int[] nums) {
        int sum=0;
        for(int num:nums){
            int rem=num%3;
            if(rem==0){
                sum+=0;
            }else{
                sum+=1;
            }
            
        }
        return sum;
        
    }
}
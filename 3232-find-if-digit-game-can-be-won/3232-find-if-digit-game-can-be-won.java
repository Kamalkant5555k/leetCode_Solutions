class Solution {
    public boolean canAliceWin(int[] nums) {
        int onesSum=0;
        int twoSum=0;
        for(int num:nums){
            if(num<10){
                onesSum+=num;
            }else{
                twoSum+=num;
            }
        }
        // if(nums[0]<10){
        //     if(onesSum>twoSum){
        //         return true;
        //     }else{
        //         return false;
        //     }
        // }else{
        //     if(onesSum>twoSum){
        //         return false;
        //     }else{
        //         return true;
        //     }
        // }
        return onesSum!=twoSum;
    }
}
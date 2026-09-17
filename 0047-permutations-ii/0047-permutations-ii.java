class Solution {
    static List<List<Integer>>ans;
    static HashSet<List<Integer>>set;
  
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans=new ArrayList<>();
        set=new HashSet<>();
        permute(0,nums);
        return ans;  
    }
    static void permute(int idx,int[] nums){
        int n=nums.length;
         if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            if(!set.contains(temp)){
                set.add(temp);
                ans.add(temp);
            }
                return;
        }
        for(int i=idx;i<n;i++){
            int t=nums[idx];
            nums[idx]=nums[i];
            nums[i]=t;
            permute(idx+1,nums);
             t=nums[idx];
            nums[idx]=nums[i];
            nums[i]=t;
        }
    
   
    }
}
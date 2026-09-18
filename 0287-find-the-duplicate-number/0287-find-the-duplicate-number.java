class Solution {
    public int findDuplicate(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int num:nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//             if(map.get(num)>=2){
//                 return num;
//             }
//         }
//   return -1;

// slow and fast approach complexity O(n) space O(1)--
  int n=nums.length;
  int slow=nums[0];
  int fast=nums[0];
  do{
    slow=nums[slow];
    fast=nums[nums[fast]];
  }while(slow!=fast);

        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
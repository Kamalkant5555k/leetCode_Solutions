// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         HashSet<List<Integer>> set = new HashSet<>();
//         int n = nums.length;
//         for(int i = 0; i < n; i++) {
//             for(int j = i + 1; j < n; j++) {
//                 for(int k = j + 1; k < n; k++) 
//                     if(nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> al = new ArrayList<>();
//                         al.add(nums[i]);
//                         al.add(nums[j]);
//                         al.add(nums[k]);

//                         Collections.sort(al);
//                         if(!set.contains(al)) {
//                             set.add(al);
//                             ans.add(al);
//                         }
//                     }
//                 }
//             }
//         return ans;
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l=i+1;
            int h=n-1;
            while(l<h){
                int sum=nums[i]+nums[l]+nums[h];
                if(sum==0){
                    ArrayList<Integer>al=new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[l]);
                    al.add(nums[h]);
                    ans.add(al);
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }else if(sum<0){
                    l++;
                }else{
                    h--;
                }
            }

        }
        return ans;

    }
    }
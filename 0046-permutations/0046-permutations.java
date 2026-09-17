class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        permute(0, nums);
        return ans;
    }
    static void permute(int idx, int[] nums) {
        if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;

        }
        for (int i = idx ; i < nums.length; i++) {
            int t = nums[i];
            nums[i] = nums[idx];
            nums[idx] = t;
            permute(idx + 1, nums);
            t = nums[i];
            nums[i] = nums[idx];
            nums[idx] = t;

        }

    }
}
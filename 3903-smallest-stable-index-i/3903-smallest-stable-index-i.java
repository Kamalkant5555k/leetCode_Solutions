class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        // if(n==1 && k==0){
        //     return 0;
        // }
        // if(k==0){
        //     return -1;
        // }
        int idx=-1;
        PriorityQueue<Integer>minH=new PriorityQueue<>();
        PriorityQueue<Integer>maxH=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            minH.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            maxH.add(nums[i]);
            int max=maxH.peek();
            int min=minH.peek();
            if(max-min<=k){
                return i;
            }
            minH.remove(nums[i]);
        }
        return -1;
        
    }
}
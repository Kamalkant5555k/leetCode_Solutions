class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int n=arr.length;
        int left=0;
        int sum=0;
        for(int ryt=0;ryt<n;ryt++){
            sum+=arr[ryt];
            while(ryt-left+1>k){
                sum-=arr[left];
                left++;
            }
            if(ryt-left+1==k){
                if(sum/k>=threshold){
                    count++;
                }
            }
        }
        return count;
    }
}
class Solution {
    static int[] ans;
    public int[] sortArray(int[] nums) {
        ans=new int[nums.length];
        int l=0;
        int h=nums.length-1;
        mergeSort(nums,l,h);
        return nums;
        
    }
    public void mergeSort(int[] nums,int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,h);
            merge(nums,l,mid,h);
        }
    }
    public void merge(int[] nums,int l,int mid,int h){
        int left=l;
        int right=mid+1;
        int k=l;
        while(left<=mid && right<=h){
            if(nums[left]<=nums[right]){
                ans[k]=nums[left];
                left++;
            }else{
                ans[k]=nums[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            ans[k]=nums[left];
            left++;
            k++;
        }
        while(right<=h){
            ans[k]=nums[right];
            right++;
            k++;
        }
        for(int i = l; i <= h; i++) {
       nums[i] = ans[i];
      }
    }
}
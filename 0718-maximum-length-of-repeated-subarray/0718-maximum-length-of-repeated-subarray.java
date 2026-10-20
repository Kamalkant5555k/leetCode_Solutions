class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int maxR=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                int count=0;
                int n=i;
                int m=j;
                
                    while(n<n1 && m<n2){
                        if(nums1[n]==nums2[m]){
                            count++;
                            maxR=Math.max(maxR,count);
                            n++;
                            m++;
                        }else{
                            break;
                        }
                    }
                
            }
        }
        return maxR;
        
    }
}
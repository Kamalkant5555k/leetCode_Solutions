class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        vector<int> arr;
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.size() && j<nums2.size ()){
            if(nums1[i]<nums2[j]){
                arr.push_back(nums1[i]);
                i++;
                k++;
            }else{
                arr.push_back(nums2[j]);
                k++;
                j++;
            }
           
        }
        while(i<nums1.size()){
            arr.push_back(nums1[i]);
            k++;
            i++;
        }
        while(j<nums2.size()){
            arr.push_back(nums2[j]);
            k++;
            j++;
        }
        int n=arr.size();
    double avg;
    if (n % 2 == 0) {
        avg = ((double)arr[n / 2 - 1] + (double)arr[n / 2]) / 2.0;
    } else {
        avg = (double)arr[n / 2];
    }

    return avg;
}
    
};
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer>st=new Stack<>();
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int num:nums2){
        while(!st.isEmpty() && num>st.peek()){
            map.put(st.peek(),num);
            st.pop();
        }
        st.push(num);
       }
       while(!st.isEmpty()){
        map.put(st.peek(),-1);
        st.pop();
       }
       int n1=nums1.length;
       int[] ans=new int[n1];
       int idx=0;
       for(int num:nums1){
        if(map.containsKey(num)){
            ans[idx++]=map.get(num);
        }
       }
       return ans;
        

    }
}





























































// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;
        
//         int[] ans = new int[n1];
//         for(int i = 0; i < n1; i++) { 
//             int j;
//             for(j = 0; j < n2; j++) {
//                 if(nums2[j] == nums1[i]) {
//                     break;
//                 }
//             }
//             int nextGreater = -1;
            
//             for(int k = j + 1; k < n2; k++) {
//                 if(nums2[k] > nums1[i]) {
//                     nextGreater = nums2[k];
//                     break;
//                 }
//             }
            
//             ans[i] = nextGreater;
//         }
        
//         return ans;
//     }
// }
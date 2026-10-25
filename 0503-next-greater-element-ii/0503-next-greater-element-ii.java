class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n=arr.length;
    
         Stack<Integer>st=new Stack<>();
         
        for(int i=n-1;i>=0;i--){
            st.push(arr[i]);
        
        }
           
            int[] gr=new int[n];
            int j=n-1;
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    gr[i]=-1;
                }else{
                    gr[i]=st.peek();
                }
                j--;
                st.push(arr[i]);
            }
            return gr;

            // second method
        
        //    int n = arr.length;
        // int[] res = new int[n];
        // Arrays.fill(res, -1);
        // Stack<Integer> st = new Stack<>();
        // for(int i = 2*n - 1; i >= 0; i--) {
        //     int idx = i % n;
        //     while(!st.isEmpty() && st.peek() <= arr[idx]) {
        //         st.pop();
        //     } 
        //     if(i < n) { 
        //         if(!st.isEmpty()) {
        //             res[idx] = st.peek();
        //         }
        //     }
            
        //     st.push(arr[idx]);
        // }
        // return res;
    }
}